<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  <!-- Импортировали тег form:form -->
<%--
  Created by IntelliJ IDEA.
  User: dimao
  Date: 02.03.2024
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Title</title>
    </head>
    <body>
        <h2>Dear Employee, Please enter your details</h2>
        <br>
        <br>
        <form:form action="showDetails" modelAttribute="employee">
            <p>Name <form:input path="name" /></p>
            <p>Surname <form:input path="surname" /></p>
            <p>Salary <form:input path="salary" /></p>
            <input type="submit" value="OK">
        </form:form>
    </body>
</html>
