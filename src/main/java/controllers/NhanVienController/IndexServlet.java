package controllers.NhanVienController;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "IndexServlet", value = {"/nhanvien", "/nhanvien/*"})
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if(pathInfo == null){
            RequestDispatcher rd = request.getRequestDispatcher("/views/NhanVien/index.jsp");
            rd.forward(request, response);
        }else{
            int idnv = Integer.parseInt(pathInfo.replace("/", ""));
            HttpSession session = request.getSession();
            session.setAttribute("idnv", idnv);
            RequestDispatcher rd = request.getRequestDispatcher("/views/NhanVien/detail.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
