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
        <form action="showDetails" method="get">
            <input type="text" name="employeeName" placeholder="Write your name" />  <!-- Запоминаем имя работника -->
            <input type="submit" />
        </form>
    </body>
</html>
