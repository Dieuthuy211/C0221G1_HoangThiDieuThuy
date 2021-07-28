package controller;

import model.bean.Student;
import model.service.IStudentService;
import model.service.impl.StudentServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet",urlPatterns = {"/students",""})
public class StudentServlet extends HttpServlet {
    IStudentService studentService=new StudentServiceImp();
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
//                search(request, response);
                break;
            default:
                showStudent(request, response);
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
                showStudent(request, response);
                break;
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));

        List<Student> students = studentService.findAll();
        request.setAttribute("students", students);
        RequestDispatcher requestDispatcher=null ;
        if(students==null){
            requestDispatcher=request.getRequestDispatcher("error-404");
        }else {
            boolean check=studentService.delete(id);
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
        List<Student> students=studentService.findAll();
        request.setAttribute("message",message);
        request.setAttribute("students",students);
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
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Double point=Double.parseDouble(request.getParameter("point"));
        Student student = new Student(id,name,gender,birthday,email,address,point);
        studentService.update(student);
        request.setAttribute("message","da sua thanh cong");
        request.setAttribute("student",student);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
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
        Student student=studentService.findById(id);
        request.setAttribute("student", student);
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
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
       Double point=Double.parseDouble(request.getParameter("point"));
        Student student = new Student(name,gender,birthday,email,address,point);
        studentService.insert(student);
        request.setAttribute("message","da tao thanh cong");
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

    private void showStudent(HttpServletRequest request, HttpServletResponse response) {
        List<Student> students = studentService.findAll();
        request.setAttribute("students", students);
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
