package servlet;

import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CustomerServlet",urlPatterns = "")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer> list=new ArrayList<>();
        list.add(new Customer("Hoàng Ánh Hông","20-10-1998","Đà Nẳng","anh1"));
        list.add(new Customer("Nguyễn Thùy Linh","10-02-1999","Huế","anh2"));
        list.add(new Customer("trần Quốc Hưng","21-1-2000","Hội An","anh3"));
        list.add(new Customer("Đặng Thùy Dương","23-06-1997","Quảng Bình","anh4"));
        list.add(new Customer("Lê Minh Ngọc","12-4-2001","Quảng Trị","anh5"));
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request,response);
    }
}
