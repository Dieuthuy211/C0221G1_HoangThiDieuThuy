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
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description : "+tenSanPham+"</h1>");
        writer.println("<h1>Discount Amount : "+luongChietKhau+"</h1>");
        writer.println("<h1>Discount Price : "+giaChietKhau+"</h1>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
