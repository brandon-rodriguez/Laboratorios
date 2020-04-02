<%-- 
    Document   : index
    Created on : 20/03/2020, 09:00:01 AM
    Author     : brandonrodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css">
        <title>Student Information</title>
    </head>
    <body>
        <div class="tittle">
            <h1>Action Panel</h1> 
        </div>
        <div class="flex">
            <div>
                <form action="./StudentServlet" method="post">
                    <table class="center">
                        <tr>
                            <td>Student ID:</td>
                            <td><input type="text" name="studentId" value="${student.studentId}"/></td>
                        </tr>
                        <tr>
                            <td>First Name:</td>
                            <td><input type="text" name="firstname" value="${student.firstname}"/></td>
                        </tr>
                        <tr>
                            <td>First Name:</td>
                            <td><input type="text" name="lastname" value="${student.lastname}"/></td>
                        </tr>
                        <tr>
                            <td>Year Level:</td>
                            <td><input type="text" name="yearLevel" value="${student.yearLevel}"/></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input type="submit" name="action" value="Add" onclick="showT('student')"/>
                                <input type="submit" name="action" value="Edit" onclick="showT('student')"/>
                                <input type="submit" name="action" value="Delete" onclick="showT('student')"/>
                                <input type="submit" name="action" value="Search" onclick="showT('student')"/>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <div>
                <form action="./ClassServlet" method="post">
                    <table class="center">
                        <tr>
                            <td>Class code:</td>
                            <td><input type="text" name="code" value="${class.code}"/></td>
                        </tr>
                        <tr>
                            <td>Name:</td>
                            <td><input type="text" name="name" value="${class.name}"/></td>
                        </tr>
                        <tr>
                            <td>Credits:</td>
                            <td><input type="text" name="credits" value="${class.credits}"/></td>
                        </tr>
                        <tr>
                            <td>Semester:</td>
                            <td><input type="text" name="semester" value="${class.semester}"/></td>
                        </tr>
                        <tr>
                            <td>Max Students:</td>
                            <td><input type="text" name="maxStudents" value="${class.maxStudents}"/></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input type="submit" name="actionC" value="Add" onclick="showT('class')"/>
                                <input type="submit" name="actionC" value="Edit" onclick="showT('class')"/>
                                <input type="submit" name="actionC" value="Delete" onclick="showT('class')"/>
                                <input type="submit" name="actionC" value="Search" onclick="showT('class')"/>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <div>
                <form action="./RelationServlet" method="post">
                    <table class="center">
                        <tr>
                            <td>Student code:</td>
                            <td><input type="text" name="studentCode" value="${relation.studentCode}"/></td>
                        </tr>
                        <tr>
                            <td>Class code</td>
                            <td><input type="text" name="classCode" value="${relation.classCode}"/></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input type="submit" name="actionR" value="Add" onclick="showT('relation')"/>
                                <input type="submit" name="actionR" value="Delete" onclick="showT('relation')"/>
                                <input type="submit" name="actionR" value="Search" onclick="showT('relation')"/>
                                <input type="submit" name="actionR" value="SearchAll" onclick="showT('relation')"/>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>



        <div class="tittle">
            <h1>General Information</h1> 
        </div>
        <div class="table">
            <div id="studentTable">
                <table class="tableQ">
                    <th>ID</th>
                    <th>Firstname</th>
                    <th>LastName</th>
                    <th>Year Level</th>
                        <c:forEach items="${allStudents}" var="stud">
                        <tr>
                            <td>${stud.studentId}</td>
                            <td>${stud.firstname}</td>
                            <td>${stud.lastname}</td>
                            <td>${stud.yearLevel}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div id="classTable">
                <table class="tableQ">
                    <th>Code</th>
                    <th>Name</th>
                    <th>Credits</th>
                    <th>Semester</th>
                    <th>Max Studnets</th>
                        <c:forEach items="${allClasses}" var="cla">
                        <tr>
                            <td>${cla.code}</td>
                            <td>${cla.name}</td>
                            <td>${cla.credits}</td>
                            <td>${cla.semester}</td>
                            <td>${cla.maxStudents}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div id="relationsTable">
                <table class="tableQ">
                    <th>Student Code</th>
                    <th>Student Name</th>
                    <th>Class Code</th>
                    <th>Class Name</th>

                    <c:forEach items="${allRelations}" var="rel">
                        <tr>
                            <td>${rel.studentCode}</td>
                            <td>${rel.studentName}</td>
                            <td>${rel.classCode}</td>
                            <td>${rel.className}</td>
                            <!--                        <td></td>-->
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <!--        <div class="student">
                    <div class="tittle">
                        <h1>Student Information</h1> 
                    </div>
                </div>-->
        <!--        <div class="class">
        
                    <div class="tittle">
                        <h1>Class Information</h1> 
                    </div>
        
                    <div>
                        <div class="tittle">
                            <h1>General Information of Classes</h1> 
                        </div>
                    </div>
                    <br>
                </div>-->
        <!--        <div class="relations">
                    <div class="tittle">
                        <h1>Relations Student-Clases form</h1> 
                    </div>-->
    </body>
    <script src="script.js"></script>
</html>
