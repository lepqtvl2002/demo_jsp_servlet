package controllers.NhanVienController;

import dao.NhanVienDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CreateServlet", value = "/nhanvien/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/views/NhanVien/create.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tennv = request.getParameter("tennv");
        String idpb = request.getParameter("idpb");
        String diachi = request.getParameter("diachi");
        String redirectURL = "./";

        NhanVienDAO nhanvienDAO = new NhanVienDAO();
        if (nhanvienDAO.createNhanVien(tennv, Integer.parseInt(idpb), diachi)) {
        } else {
            redirectURL = "";
        }
        response.sendRedirect(redirectURL);
    }
}
