<%-- 
    Document   : response
    Created on : 17/03/2020, 12:31:50 p. m.
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
       <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name"  />
        <jsp:setProperty name="mybean" property="year"  />
        <jsp:setProperty name="mybean" property="semester"  />
        <jsp:setProperty name="mybean" property="birthday"  />
        <div class="tittle">
            <h1>Hola, 
            <jsp:getProperty name="mybean" property="name" />
        !</h1>
        <h5>
           Fecha actual  <jsp:getProperty name="mybean" property="date" /> 
        </h5>
        </div>
        
        <div class="content">
           <p>
            Tiene 
            <jsp:getProperty name="mybean" property="birthday" /> 
            años, su semestre actual en la Universidad es 
            <jsp:getProperty name="mybean" property="semester" />
        </p> 
        </div>
        
    </body>
</html>
