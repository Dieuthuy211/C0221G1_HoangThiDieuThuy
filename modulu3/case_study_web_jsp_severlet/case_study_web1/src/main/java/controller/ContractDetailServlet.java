package controller;

import model.bean.*;
import model.repository.ContractDetailRepository;
import model.service.IService;
import model.service.impl.ContractDetailImp;
import model.service.impl.ContractImpl;
import model.service.impl.CustomerServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractDetailServlet",urlPatterns = {"/contractDetails"})
public class ContractDetailServlet extends HttpServlet {
IService contractDetailService=new ContractDetailImp();
IService contractService=new ContractImpl();
IService customerService=new CustomerServiceImp();

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
        List<AttachService> attachServices=this.contractDetailService.selectAttachService();
        request.setAttribute("attachServices", attachServices);
        List<Customer> customers=this.customerService.findAll();
        request.setAttribute("customers", customers);
        List<ConTract> conTracts=this.contractService.findAll();
        request.setAttribute("conTracts", conTracts);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/ContractDetail/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void create(HttpServletRequest request, HttpServletResponse response) {
        int contractId = Integer.parseInt(request.getParameter("contractId"));
        int attachServiceId = Integer.parseInt(request.getParameter("attachServiceId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        ContractDetail contractDetail = new ContractDetail(contractId,attachServiceId,quantity);
        contractDetailService.save(contractDetail);
        request.setAttribute("message","da tao thanh cong");
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/ContractDetail/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
