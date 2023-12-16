<%-- 
    Document   : conexion
    Created on : 14 dic 2023, 20:14:15
    Author     : Jasmin
--%>

<%@ page language="java" import="java.sql.*" %>
<%
Connection conexion = null;
PreparedStatement st = null;
ResultSet rs = null;
Class.forName("org.mariadb.jdbc.Driver");
conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/registros", "root", "1234");
%>

