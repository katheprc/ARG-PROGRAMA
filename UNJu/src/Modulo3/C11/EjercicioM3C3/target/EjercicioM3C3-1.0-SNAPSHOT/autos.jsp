<%@page import="ejerciciom3c3.ejerciciom3c3.Auto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <p>Formulario autos</p>
        
        <form action="SvAutos" method="Post">
            Patente: <input type="text" name="patente"><br>
            Marca: <input type="text" name="marca"><br>
            Modelo: <input type="text" name="modelo"><br>
            Color: <input type="text" name="color"><br>
            Tipo de motor: <input type="text" name="tipoMotor"><br>
            <input type="submit" value="Guardar Auto">
        </form>
        
        <p>
            
            
        </p>
        
        <form action="SvAutosGET" method="Get">
            <input type="submit" value="Mostrar Autos">
        </form>
        
    </body>
</html>
