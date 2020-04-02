<%-- 
    Document   : index
    Created on : 19/03/2020, 10:23:51 AM
    Author     : brandonrodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css">
        <title>JSP Page</title>
        <script src="script.js"></script>
    </head>
    <body>
        <div class="tittle">
            <h1>Calculadora!</h1>
        </div>
        <div class="board">
        <form action="beanServlet" method="post">
            <input type="text" name="t1" placeholder="a+b" id="inputO" >
             <input type="submit" value="calcular!">
        </form>
            
            <table>
                <tr>
                    <th><div class="cell" onclick="writeInput('1')">1</div></th>
                    <th><div class="cell" onclick="writeInput('2')">2</div></th>
                    <th><div class="cell" onclick="writeInput('3')">3</div></th>
                    <th><div class="cellO" onclick="writeInput(' + ')">+</div></th>
                </tr>
                 <tr>
                    <th><div class="cell" onclick="writeInput('4')">4</div></th>
                    <th><div class="cell" onclick="writeInput('5')">5</div></th>
                    <th><div class="cell" onclick="writeInput('6')">6</div></th>
                    <th><div class="cellO" onclick="writeInput(' - ')">-</div></th>
                </tr>
                 <tr>
                    <th><div class="cell" onclick="writeInput('7')">7</div></th>
                    <th><div class="cell" onclick="writeInput('8')">8</div></th>
                    <th><div class="cell" onclick="writeInput('9')">9</div></th>
                    <th><div class="cellO" onclick="writeInput(' * ')">*</div></th>
                </tr>
                <tr>
                    <th></th>
                    <th><div class="cell" onclick="writeInput('0')">0</div></th>
                     <th></th>
                    <th><div class="cellO" onclick="writeInput(' / ')">/</div></th>
                </tr>
            </table>    
           
        </div>
        
    </body>
    
</html>
