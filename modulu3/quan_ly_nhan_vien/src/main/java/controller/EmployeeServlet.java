package controller;

import model.bean.Employee;
import model.service.IEmployee;
import model.service.impl.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "EmployeeServlet",urlPatterns = {"/employees",""})
public class EmployeeServlet extends HttpServlet {
    IEmployee employeeService=new EmployeeService();
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
                delete(request, response);
                break;

            case "search":
                search(request, response);
                break;
            default:
                showEmployee(request, response);
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
                showEmployee(request, response);
                break;
    }

}


    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("tim");
        List<Employee> employees = employeeService.search(name);
        request.setAttribute("employees", employees);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        employeeService.delete(id);
        List<Employee> employees = employeeService.findAll();
        request.setAttribute("employees", employees);
        RequestDispatcher requestDispatcher=null ;
        if(employees==null){
            requestDispatcher=request.getRequestDispatcher("error-404");
        }else {
            boolean check=employeeService.delete(id);;
            String message=null;
            if(check){
                message="xoa thanh cong";
            }else {
                message="xoa khong thanh cong";
            }
            listDelete(request,response,message);
        }
    }

    private void listDelete(HttpServletRequest request, HttpServletResponse response, String message) {
        List<Employee> employees=employeeService.findAll();
        request.setAttribute("message",message);
        request.setAttribute("employees",employees);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Employee employee = new Employee(id,name,birthday);
        Map<String,String> map =employeeService.update(employee);
        request.setAttribute("map",map);
        request.setAttribute("employee",employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Employee employee=employeeService.findById(id);
        request.setAttribute("employee", employee);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/edit.jsp");


        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {

        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Employee employee = new Employee(name,birthday);
        Map<String,String> map =employeeService.insert(employee);
        request.setAttribute("map",map);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employees = employeeService.findAll();
        request.setAttribute("employees", employees);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
