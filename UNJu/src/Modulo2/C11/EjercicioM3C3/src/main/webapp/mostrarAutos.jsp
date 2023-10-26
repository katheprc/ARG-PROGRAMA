<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="ejerciciom3c3.ejerciciom3c3.Auto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Lista de Autos</h2>
        <table border="1">
            <tr>
                <th>Patente</th>
                <th>Marca</th>
                <th>Modelo</th>
                <th>Color</th>
                <th>Tipo de Motor</th>
            </tr>
            <%
                ArrayList<Auto> listaAutos2 = (ArrayList<Auto>) request.getSession().getAttribute("listaAutos");
                for (Auto auto : listaAutos2) {
            %>
            <tr>
                <td><%= auto.getPatente()%></td>
                <td><%= auto.getMarca()%></td>
                <td><%= auto.getModelo()%></td>
                <td><%= auto.getColor()%></td>
                <td><%= auto.getTipoMotor()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
