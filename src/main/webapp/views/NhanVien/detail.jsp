<%@ page import="dao.NhanVienDAO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="models.NhanVienModel" %><%--
  Created by IntelliJ IDEA.
  User: thngtrn
  Date: 28/11/2022
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thông tin nhân viên</title>
</head>
<body>
  <%
      NhanVienDAO nhanvienDAO = new NhanVienDAO();
      System.out.println(session.getAttribute("idnv"));
      NhanVienModel nhanvien = nhanvienDAO.getNhanVienById((int)session.getAttribute("idnv"));
      System.out.println(nhanvien);
      if (nhanvien != null) {
  %>
        <h1><%=nhanvien.getName()%></h1>
        <h2><%=nhanvien.getIdpb()%></h2>
        <h2><%=nhanvien.getAddress()%></h2>
    <%}%>
</body>
</html>
