<%@ page import="dao.NhanVienDAO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="models.NhanVienModel" %><%--
  Created by IntelliJ IDEA.
  User: thngtrn
  Date: 28/11/2022
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách nhân viên</title>
</head>
<body>
    <h1>Danh sách nhân viên</h1>
    <% NhanVienDAO nhanvienDAO = new NhanVienDAO();
    System.out.println("???");
    ArrayList<NhanVienModel> nhanviens = nhanvienDAO.getList();
    if (nhanviens != null) {
        for (NhanVienModel nhanvien: nhanviens) { %>
            <a href="nhanvien/<%=nhanvien.getId()%>"><%=nhanvien.getName()%></a>
            <a href="nhanvien/delete">Delete</a>
            <br/>
        <%}
    }%>

</body>
</html>
