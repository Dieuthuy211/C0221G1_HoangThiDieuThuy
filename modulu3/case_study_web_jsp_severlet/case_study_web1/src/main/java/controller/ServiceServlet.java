package controller;


import model.bean.RentType;
import model.bean.Service;
import model.bean.ServiceType;
import model.service.IService;
import model.service.impl.ServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet",urlPatterns = {"/services"})
public class ServiceServlet extends HttpServlet {
    private IService services=new ServiceImp();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String serviceName = request.getParameter("serviceName");
        int serviceArea = Integer.parseInt(request.getParameter("serviceArea"));
        String servicePrice = request.getParameter("servicePrice");
        int serviceMaxPeople = Integer.parseInt(request.getParameter("serviceMaxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int serviceTypeId = Integer.parseInt(request.getParameter("serviceTypeId"));
        String standradRoom = request.getParameter("standradRoom");
        String status = request.getParameter("status");
        int poolArea = Integer.parseInt(request.getParameter("poolArea"));
        int numberOfFloors = Integer.parseInt(request.getParameter("numberOfFloors"));
//        String serviceName, int serviceArea, String servicePrice, int serviceMaxPeople, int rentTypeId, int serviceTypeId, String standradRoom, String status, int poolArea, int numberOfFloors
        Service service = new Service(serviceName,serviceArea,servicePrice,serviceMaxPeople,rentTypeId,serviceTypeId,standradRoom,status,poolArea,numberOfFloors);
        services.save(service);
        request.setAttribute("message","da tao thanh cong");
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/service/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ServiceType> serviceTypes= services.select();
        request.setAttribute("serviceTypes", serviceTypes);
        List<RentType> rentTypes= services.selectRentType();
        request.setAttribute("rentTypes", rentTypes);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/service/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
