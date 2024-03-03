<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dimao
  Date: 02.03.2024
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Show Details</title>
</head>
<body>
    <h2>Dear Employee, you are WELCOME!!!</h2>
    <br>
    <p>Your name: ${employee.name}</p>
    <p>Your surname: ${employee.surname}</p>
    <p>Your salary: ${employee.salary}</p>
    <p>Your department: ${employee.department}</p>
    <p>Your car: ${employee.carBrand}</p>
    <p>
        Language(-s):
    </p>
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
    <p>Phone Number: ${employee.phoneNumber}</p>
</body>
</html>
