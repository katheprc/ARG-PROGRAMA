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
        <h1>ALTA PROFESORES!</h1>
        <%
            try {
                ProfesorDAO pdao = new ProfesorDAO();
                AsignaturaDAO adao = new AsignaturaDAO();
                String legajo = request.getParameter("legajo");
                String nombreAsig = request.getParameter("nombreasig");
                String nombres = request.getParameter("nombres");
                String apellidos = request.getParameter("apellidos");
                String telefono = request.getParameter("telefono");
                Profesor profe = null;
                boolean encontrado = false;
                boolean encontrado2 = false;
                for (Profesor profesor : pdao.listar()) {
                    if (profesor.getLegajo().equals(legajo)) {
                        encontrado = true;
                        profe = profesor;

                    }
                }

                for (Asignatura asignatura : adao.listar()) {
                    if (asignatura.getNombre().equals(nombreAsig)) {
                        encontrado2 = true;
                    }
                }

                if (!encontrado2 && encontrado) {
                    Asignatura asignatura1 = new Asignatura(nombreAsig, profe);
                    adao.guardarDao(asignatura1);
                    out.println("Asignatura guardada exitosamente");
                }

                if (!encontrado && !encontrado2) {
                    Profesor profesor1 = new Profesor(legajo, nombres, apellidos, telefono);
                    pdao.guardarDao(profesor1);
                    Asignatura asignatura = new Asignatura(nombreAsig, profesor1);
                    adao.guardarDao(asignatura);
                    out.println("Profesor y asignatura guardados exitosamente");
                }

                if (!encontrado && encontrado2) {
                    out.println("Error, intente nuevamente. La asignatura es impartida por otro profesor");
                }

                if (encontrado && encontrado2) {
                    out.println("Un profesor ya imparte esta materia");
                }

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