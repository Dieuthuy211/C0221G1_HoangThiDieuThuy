package controller;

import model.bean.customer.Customer;
import model.bean.customer.CustomerType;
import model.service.IService;
import model.service.impl.CustomerServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customers"})
public class CustomerServlet extends HttpServlet {
    private IService customerService = new CustomerServiceImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "edit":
                edit(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;

            case "search":
                search(request, response);
                break;
            default:
                showCustomer(request, response);
                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "edit":
                showEdit(request, response);
                break;


            default:
                showCustomer(request, response);
                break;
        }
    }


    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("tim");
        List<Customer> customers = customerService.search(name);
        request.setAttribute("customers", customers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int idcustomerType = Integer.parseInt(request.getParameter("customerType"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String card = request.getParameter("card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, idcustomerType, name, gender, dateOfBirth, card, phone, email, address);
        customerService.update(customer);
        request.setAttribute("message","da sua thanh cong");
        request.setAttribute("customer",customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
       Customer customer= (Customer) customerService.findById(id);
        List<CustomerType> customerTypes=customerService.selectCustomerType();
        request.setAttribute("customerTypes", customerTypes);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
        request.setAttribute("customer", customer);

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void create(HttpServletRequest request, HttpServletResponse response) {
        int idcustomerType = Integer.parseInt(request.getParameter("customerType"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String card = request.getParameter("card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(idcustomerType, name, gender, dateOfBirth, card, phone, email, address);
        customerService.save(customer);
        request.setAttribute("message","da tao thanh cong");
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/customer/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypes=customerService.selectCustomerType();
        request.setAttribute("customerTypes", customerTypes);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers = this.customerService.findAll();
        request.setAttribute("customers", customers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.remove(id);
        List<Customer> customers = this.customerService.findAll();
        request.setAttribute("customers", customers);
        RequestDispatcher requestDispatcher=null ;
        if(customers==null){
            requestDispatcher=request.getRequestDispatcher("error-404");
        }else {
            boolean check=this.customerService.remove(id);
            String message=null;
            if(check){
              message="xoa thanh cong";
            }else {
                message="xoa khong thanh cong";
            }
            listCustomer(request,response,message);
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response, String message) {
        List<Customer> customer=this.customerService.findAll();
        request.setAttribute("message",message);
        request.setAttribute("customer",customer);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/customer/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
