<%-- 
    Document   : index
    Created on : 17/03/2020, 12:29:23 p. m.
    Author     : brandonrodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>JSP Page</title>
        
    </head>
    <body>
        <div class="tittle">
            <h1>Ingrese sus datos</h1>   
        </div>
        <div class="content">
        <form name="Name Input Form" action="response.jsp" > 
           Ingrese su nombre:
            <input type="text" name="name" /><br>  
           Ingrese su año de ingreso:
            <input type="text" name="year" placeholder="AAAA-MM-DD" /><br>
           Ingrese su semestre de ingreso:
           <input type="text" name="semester" placeholder="1/2"/> <br>  
           Ingrese su fecha de nacimiento:
           <input type="text" name="birthday" placeholder="AAAA-MM-DD"/>  <br> 
            
            <input type="submit" value="Enviar" />        
        </form> 
         </div>
    </body>
</html>
