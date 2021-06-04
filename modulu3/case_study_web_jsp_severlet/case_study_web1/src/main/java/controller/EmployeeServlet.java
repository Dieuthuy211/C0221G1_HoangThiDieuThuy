package controller;

import model.bean.Customer;
import model.bean.Employee;
import model.service.IService;
import model.service.impl.EmployeeServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employees")
public class EmployeeServlet extends HttpServlet {
    IService employeeService = new EmployeeServiceImp();

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
                showEployee(request, response);
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
                showEployee(request, response);
                break;
        }
    }


    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("tim");
        List<Employee> employees = employeeService.search(name);
        request.setAttribute("employees", employees);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        this.employeeService.remove(employeeId);
        List<Employee> employees =this.employeeService.findAll();
        request.setAttribute("employees", employees);
        RequestDispatcher requestDispatcher=null ;
        if(employees==null){
            requestDispatcher=request.getRequestDispatcher("error-404");
        }else {
            boolean check=employeeService.remove(employeeId);
            String message=null;
            if(check){
                message="xoa thanh cong";
            }else {
                message="xoa khong thanh cong";
            }
            listEmployee(request,response,message);
        }
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response, String message) {
        List<Employee> employee=employeeService.findAll();
        request.setAttribute("message",message);
        request.setAttribute("employee",employee);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/employee/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        String employeeName = request.getParameter("employeeName");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String employeeBirthday = request.getParameter("employeeBirthday");
        String employeeIdCard = request.getParameter("employeeIdCard");
        Double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
        String employeePhone = request.getParameter("employeePhone");
        String employeeEmail = request.getParameter("employeeEmail");
        String employeeAddress = request.getParameter("employeeAddress");
        String username = request.getParameter("username");
       Employee employee=new Employee(employeeId,employeeName,positionId,educationDegreeId,divisionId,employeeBirthday,employeeIdCard,employeeSalary,employeePhone,employeeEmail,employeeAddress,username);
        employeeService.update(employee);
        request.setAttribute("message","da sua thanh cong");
        request.setAttribute("employee",employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/edit.jsp");
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
       Employee employee= (Employee) this.employeeService.findById(id);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/edit.jsp");
        request.setAttribute("employee", employee);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        String employeeName = request.getParameter("employeeName");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String employeeBirthday = request.getParameter("employeeBirthday");
        String employeeIdCard = request.getParameter("employeeIdCard");
        Double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
        String employeePhone = request.getParameter("employeePhone");
        String employeeEmail = request.getParameter("employeeEmail");
        String employeeAddress = request.getParameter("employeeAddress");
        String username = request.getParameter("username");
        Employee employee = new Employee(employeeName, positionId, educationDegreeId, divisionId, employeeBirthday, employeeIdCard, employeeSalary, employeePhone, employeeEmail, employeeAddress, username);
        employeeService.save(employee);
        request.setAttribute("message", "da tao thanh cong");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employees = this.employeeService.findAll();
        request.setAttribute("employees", employees);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
