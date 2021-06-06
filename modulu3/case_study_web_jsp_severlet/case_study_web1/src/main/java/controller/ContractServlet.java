package controller;

import model.bean.*;
import model.service.IService;
import model.service.impl.ContractImpl;
import model.service.impl.CustomerServiceImp;
import model.service.impl.EmployeeServiceImp;
import model.service.impl.ServiceImp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet",urlPatterns = {"/contracts"})
public class ContractServlet extends HttpServlet {
    private IService contractService = new ContractImpl();
    private IService customerService=new CustomerServiceImp();
    private IService employeeService=new EmployeeServiceImp();
    private  IService serviceService=new ServiceImp();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            default:
                doGet(request,response);
                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Employee> employees=this.employeeService.findAll();
        request.setAttribute("employees", employees);
        List<Customer> customers=this.customerService.findAll();
        request.setAttribute("customers", customers);
        List<Service> services=this.serviceService.findAll();
        request.setAttribute("services", services);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/contract/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void create(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int serviceId = Integer.parseInt(request.getParameter("serviceId"));
        String contractStartDate = request.getParameter("contractStartDate");
        String contractEndDate = request.getParameter("contractEndDate");
        int deposit = Integer.parseInt(request.getParameter("deposit"));
        int total = Integer.parseInt(request.getParameter("total"));
        ConTract conTract = new ConTract(employeeId,customerId,serviceId,contractStartDate,contractEndDate,deposit,total);
        this.contractService.save(conTract);
        request.setAttribute("message","da tao thanh cong");
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/contract/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
