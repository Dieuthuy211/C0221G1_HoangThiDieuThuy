package controller;

import model.bean.DanhMuc;
import model.bean.SanPham;
import model.service.ISanPham;
import model.service.impl.SanPhamImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SanPhamServlet",urlPatterns = {"/sanPhams",""})
public class SanPhamServlet extends HttpServlet {
    ISanPham sanPhamService=new SanPhamImpl();
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
                showSanPham(request, response);
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
                showSanPham(request, response);
                break;
        }
    }


    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));

        List<SanPham> sanPhams = sanPhamService.findAll();
        request.setAttribute("sanPhams", sanPhams);
        RequestDispatcher requestDispatcher=null ;
        if(sanPhams==null){
            requestDispatcher=request.getRequestDispatcher("error-404");
        }else {
            boolean check=sanPhamService.remove(id);
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
        List<SanPham> sanPhams=sanPhamService.findAll();
        List<DanhMuc> danhMucs=sanPhamService.DanhMuc();
        request.setAttribute("message",message);
        request.setAttribute("sanPhams",sanPhams);
        request.setAttribute("danhMucs",danhMucs);
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
        String tenSanPham = request.getParameter("tenSanPham");
        int gia = Integer.parseInt(request.getParameter("gia"));
        int soLuong = Integer.parseInt(request.getParameter("soLuong"));
        String mauSsac = request.getParameter("mauSsac");
        String moTa = request.getParameter("moTa");
        int danhMuc = Integer.parseInt(request.getParameter("danhMuc"));
        SanPham sanPham = new SanPham(id,tenSanPham,gia,soLuong,mauSsac,moTa,danhMuc);
        sanPhamService.update(sanPham);
        request.setAttribute("message","da sua thanh cong");
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

        SanPham sanPham=sanPhamService.findById(id);
        request.setAttribute("sanPham", sanPham);
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
        String tenSanPham = request.getParameter("tenSanPham");
        int gia = Integer.parseInt(request.getParameter("gia"));
        int soLuong = Integer.parseInt(request.getParameter("soLuong"));
        String mauSsac = request.getParameter("mauSsac");
        String moTa = request.getParameter("moTa");
        int danhMuc = Integer.parseInt(request.getParameter("danhMuc"));
        SanPham sanPham = new SanPham(tenSanPham,gia,soLuong,mauSsac,moTa,danhMuc);
        sanPhamService.save(sanPham);
        request.setAttribute("message", "da tao thanh cong");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        List<DanhMuc> danhMucs = this.sanPhamService.DanhMuc();
        request.setAttribute("danhMucs", danhMucs);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showSanPham(HttpServletRequest request, HttpServletResponse response) {
        List<SanPham> sanPhams = this.sanPhamService.findAll();
        List<DanhMuc> danhMucs = this.sanPhamService.DanhMuc();
        request.setAttribute("sanPhams", sanPhams);
        request.setAttribute("danhMucs", danhMucs);
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
