<%-- 
    Document   : index
    Created on : 14 dic 2023, 21:54:46
    Author     : Jasmin
--%>

<%@ page language="java" import="java.sql.*" %>
<%@ include file="conexion.jsp"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Estudiantes</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }

        form input {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
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

    <h2>Registro de Estudiantes</h2>

    <form role="form" action="nuevo.jsp" method="POST">
        <input type="text" id="nombre" name="nombre" placeholder="Ingrese los nombres" required><br/>
        <input type="text" id="apellido" name="apellido" placeholder="Ingrese los apellidos" required><br/>
        <input type="submit" value="Guardar">
    </form>

    <hr>

    <table>
        <thead>
            <tr>        
                <th>Id</th>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Materias</th>
            </tr>
        </thead>
        <tbody>
            <% 
                st = conexion.prepareStatement("select * from estudiante");
                rs = st.executeQuery();
                
                while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getString("id")%></td>
                <td><%=rs.getString("nombre")%></td>
                <td><%=rs.getString("apellido")%></td>
                <td><a href="materias.jsp?id=<%=rs.getString("id")%>">Mostrar</a></td> 
            </tr>
            <% }
                conexion.close();
            %>
        </tbody>
    </table>

</body>
</html>
