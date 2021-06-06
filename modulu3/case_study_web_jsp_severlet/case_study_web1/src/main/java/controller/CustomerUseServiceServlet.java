package controller;

import model.bean.contract.AmountOfServicesIncluded;
import model.bean.contract.AttachService;
import model.bean.contract.ContractDetail;
import model.bean.customer.Customer;
import model.bean.customer.CustomerUseService;
import model.service.IService;
import model.service.impl.ContractDetailImp;
import model.service.impl.CustomerUseServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerUseServiceServlet",urlPatterns = {"/userService"})
public class CustomerUseServiceServlet extends HttpServlet {
    IService customerUseServiceService=new CustomerUseServiceImp();
    IService contractDetailService=new ContractDetailImp();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
//                edit(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;

            case "search":
                search(request, response);
                break;
            default:
                showCustomerUseService(request, response);
                break;
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
//                showEdit(request, response);
                break;
            default:
                showCustomerUseService(request, response);
                break;
        }
    }


    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("contractId"));
        customerUseServiceService.remove(id);
        List<CustomerUseService> customerUseServices = this.customerUseServiceService.findAll();
        request.setAttribute("customerUseServices", customerUseServices);
        RequestDispatcher requestDispatcher=null ;
        if(customerUseServices==null){
            requestDispatcher=request.getRequestDispatcher("error-404");
        }else {
            boolean check=this.customerUseServiceService.remove(id);
            String message=null;
            if(check){
                message="xoa thanh cong";
            }else {
                message="xoa khong thanh cong";
            }
            listCustomerUseService(request,response,message);
        }
    }

    private void listCustomerUseService(HttpServletRequest request, HttpServletResponse response, String message) {

        List<CustomerUseService> customerUseService=this.customerUseServiceService.findAll();
        request.setAttribute("message",message);
        request.setAttribute("customerUseService",customerUseService);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/customerUseService/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomerUseService(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerUseService> customerUseServices=this.customerUseServiceService.findAll();
        List<AmountOfServicesIncluded> amountOfServicesIncludeds=this.customerUseServiceService.selectAmount();

        request.setAttribute("customerUseServices",customerUseServices);
        request.setAttribute("amountOfServicesIncludeds",amountOfServicesIncludeds);


        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/customerUseService/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("tim");
        List<CustomerUseService> customerUseServices=this.customerUseServiceService.search(name);
        List<AmountOfServicesIncluded> amountOfServicesIncludeds=this.customerUseServiceService.selectAmount();
        request.setAttribute("customerUseServices",customerUseServices);
        request.setAttribute("amountOfServicesIncludeds",amountOfServicesIncludeds);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/customerUseService/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
