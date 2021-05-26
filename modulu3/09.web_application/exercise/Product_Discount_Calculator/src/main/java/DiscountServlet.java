import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",value="/ketqua")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tenSanPham=request.getParameter("tenSanPham");
        float giaNiemYet= Float.parseFloat(request.getParameter("giaNiemYet"));
        float  chietKhau=Float.parseFloat(request.getParameter("chietKhau"));
        double luongChietKhau = giaNiemYet * chietKhau * 0.01;
        double giaChietKhau = giaNiemYet*luongChietKhau;
        request.setAttribute("luongChietKhau",luongChietKhau);
        request.setAttribute("giaChietKhau",giaChietKhau);
        request.setAttribute("tenSanPham",tenSanPham);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("display.jsp");
        requestDispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
