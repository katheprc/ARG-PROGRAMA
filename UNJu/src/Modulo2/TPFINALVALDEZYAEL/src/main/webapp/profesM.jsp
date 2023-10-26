<%@page import="Entity.Profesor"%>
<%@page import="Entity.Asignatura"%>
<%@page import="Persistencia.ProfesorDAO"%>
<%@page import="Persistencia.AsignaturaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de profesores: </h1>
        <table border="1">
        <tr>
            <th>Id profesor</th>
            <th>Legajo</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>Telefono</th>
        </tr>
        <%
            try {
                ProfesorDAO pdao = new ProfesorDAO();
                for (Profesor profesor : pdao.listar()) {
        %>
        <tr>
            <td><%= profesor.getIdProfesor() %></td>
            <td><%= profesor.getLegajo() %></td>
            <td><%= profesor.getNombres() %></td>
            <td><%= profesor.getApellidos() %></td>
            <td><%= profesor.getTelefono() %></td>
        </tr>
        <%
                }
            } catch (Exception e) {
                out.println("Ha ocurrido un error: " + e.getMessage());
                e.printStackTrace();
            }
        %>
    </table>
         <h1>Lista de profesores: </h1>
        <table border="1">
        <tr>
            <th>ID asignatura</th>
            <th>Nombre asignatura</th>
            <th>Profesor</th>

        </tr>
        <%
            try {
                AsignaturaDAO adao = new AsignaturaDAO();
                for (Asignatura asignatura : adao.listar()) {
        %>
        <tr>
            <td><%= asignatura.getIdAsignatura() %></td>
            <td><%= asignatura.getNombre() %></td>
            <td><%= asignatura.getProfesor().getNombres() + " " + asignatura.getProfesor().getApellidos()%></td>
        </tr>
        <%
                }
            } catch (Exception e) {
                out.println("Ha ocurrido un error: " + e.getMessage());
                e.printStackTrace();
            }
        %>
    </table>

        <p>

        </p>


        <a href="index.html">volver al menu</a>
    </body>
</html>
