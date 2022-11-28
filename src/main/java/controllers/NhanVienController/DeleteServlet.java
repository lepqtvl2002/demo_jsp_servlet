package controllers.NhanVienController;

import dao.NhanVienDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DeleteServlet", value = {"/nhanvien/delete", "nhanvien/delete/*"})
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if(pathInfo == null){
            RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
            rd.forward(request, response);
        }else{
            int idnv = Integer.parseInt(pathInfo.replace("/", ""));
            HttpSession session = request.getSession();
            session.setAttribute("idnv", idnv);
            RequestDispatcher rd = request.getRequestDispatcher("/views/NhanVien/delete.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        int idnv = Integer.parseInt(pathInfo.replace("/", ""));
        String redirectURL = "./";

        NhanVienDAO nhanvienDAO = new NhanVienDAO();
        if (nhanvienDAO.deleteNhanVien(idnv)) {
        } else {
            redirectURL = "";
        }
        response.sendRedirect(redirectURL);
    }
}
