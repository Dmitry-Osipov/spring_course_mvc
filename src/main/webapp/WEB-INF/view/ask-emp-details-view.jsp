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
    <title>Ask Details</title>
</head>
<body>
    <h2>Dear Employee, Please enter your details</h2>
    <br>
    <br>
    <form:form action="showDetails" modelAttribute="employee">
        <p>Name&nbsp;<form:input path="name" /></p>
        <p>Surname&nbsp;<form:input path="surname" /></p>
        <p>Salary&nbsp;<form:input path="salary" /></p>
        <p>
            Department&nbsp;
            <!-- Создание дроп-даун листа: -->
            <form:select path="department">
                <!-- Хардкод вариант:
                <form:option value="Information Technology" label="IT" />
                <form:option value="Human Resources" label="HR" />
                <form:option value="Sales" label="Sales" />
                Вариант с использованием мапы в модели:
                <form:options items="${employee.department}" />
                P.s.: разница ещё и в том, что теперь в форму выбора передаётся полное название, а в конечный
                результат - сокращённое. Выше же у нас передавалось ровно наоборот. Т.е. чтобы выводилось как ранее,
                требуется полное название передавать в качестве ключа, а значением передать сокращённое название
                Вариант с использованием enum: -->
                <form:options items="${departments}" />
                <!-- Прим.: для перечислений всё работает корректно (название перечислений - в выпадающем списке,
                а полная расшифровка - на странице с информацией) + не надо enum нигде дополнительно добавлять. -->
            </form:select>
        </p>
        <p>
            Which car do you want?&nbsp;
            <form:radiobuttons path="carBrand" items="${employee.carBrands}" />
        </p>
        <p>
            Foreign language(-s)&nbsp;
            <form:checkboxes path="languages" items="${employee.languageList}" />
        </p>
        <input type="submit" value="OK">
    </form:form>
</body>
</html>
