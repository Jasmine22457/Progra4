<%-- 
    Document   : index
    Created on : 14 dic 2023, 21:54:46
    Author     : Jasmin
--%>


<%@ page language="java" import="java.sql.*" %>
<%@ include file="conexion.jsp" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla de Materias</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            border: 1px solid #ddd;
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>

    <h2>Materias</h2>
  <a href='index.jsp'>Inicio</a>
    <table>
        <thead>
            <tr>        
                <th>Id</th>
                <th>Materia</th>
                <th>Catedrático</th>
                <th>Ciclo</th>
            </tr>
        </thead>
        <tbody>
            <% 
                try {
                    st = conexion.prepareStatement("SELECT m.id, m.nombre, m.catedratico, m.ciclo " 
                            + "FROM estudiante e, carga c, materia m where e.id = c.estudiante and "
                            + "c.materia = m.id and e.id =" + request.getParameter("id"));
                    rs = st.executeQuery();

                    while (rs.next()) {
            %>
            <tr>
                <td><%= rs.getString("id") %></td>
                <td><%= rs.getString("nombre") %></td>
                <td><%= rs.getString("catedratico") %></td>
                <td><%= rs.getString("ciclo") %></td>
            </tr>
            <%
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (rs != null) rs.close();
                        if (st != null) st.close();
                        if (conexion != null) conexion.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            %>
        </tbody>
    </table>

</body>
</html>
