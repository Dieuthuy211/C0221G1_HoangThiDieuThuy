package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {


            int first = Integer.parseInt(request.getParameter("first"));

            String operator = request.getParameter("operator");

            int second = Integer.parseInt(request.getParameter("second"));
            int result = 0;

            switch (operator) {
                case "one":
                    result = first + second;
                    break;
                case "two":
                    result = first - second;
                    break;
                case "three":
                    result = first * second;
                    break;
                default:
                    try {
                        if (second == 0) {
                            throw new Exception("phep tinh khong hop le");
                        }
                        result = first / second;
                    } catch (Exception e) {
                        request.setAttribute("result", e.getMessage());
                        request.getRequestDispatcher("display.jsp").forward(request, response);
                    }
                    break;

            }
            request.setAttribute("first", first);
            request.setAttribute("operator", operator);
            request.setAttribute("second", second);
            request.setAttribute("result", result);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("display.jsp");
            requestDispatcher.forward(request, response);
        }catch (Exception e){
            request.setAttribute("result", e.getMessage());
            request.getRequestDispatcher("display.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
