<%@ page import="dao.NhanVienDAO" %>
<%@ page import="models.NhanVienModel" %><%--
  Created by IntelliJ IDEA.
  User: thngtrn
  Date: 28/11/2022
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xóa nhân viên</title>
</head>
<body>
  <h1>Bạn muốn xóa nhân viên này?</h1>
  <%
    NhanVienDAO nhanvienDAO = new NhanVienDAO();
    NhanVienModel nhanvien = nhanvienDAO.getNhanVienById((int)session.getAttribute("idnv"));
  %>
  <form action="" method="post">
    <input value="<%=nhanvien.getName()%>">
    <input value="<%=nhanvien.getIdpb()%>">
    <input value="<%=nhanvien.getAddress()%>">
    <button type="submit">Submit</button>
    <a href="../">Back</a>
  </form>
</body>
</html>
