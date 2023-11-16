<%@page import="Entity.Profesor"%>
<%@page import="Entity.Asignatura"%>
<%@page import="Persistencia.ProfesorDAO"%>
<%@page import="Persistencia.AsignaturaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Profesor eliminado exitosamente!</h1>

        <p>

        </p>

        <%
            try {
                String legajo = request.getParameter("legajo");
                ProfesorDAO pdao = new ProfesorDAO();
                pdao.eliminarDao(legajo);
            } catch (Exception e) {
                out.println("Ha ocurrido un error: " + e.getMessage());
                e.printStackTrace();
            }
        %>

        <p>

        </p>

        <a href="index.html">volver al menu</a>
    </body>
</html>
