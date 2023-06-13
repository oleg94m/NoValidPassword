
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pass data</title>
</head>
<body>
<%--Помимо атрибутов id, action, method, есть атрибут modelAttribute с параметром user --%>
<%--Это форма, в которую мы будем передавать данные, а эти данные будут сетиться в объект типа User--%>
<form id = "user-form" action="/pass-data" method="post" modelAttribute = ${user}>
    <p>Name :<input type = "text" name = "name"></p>
    <p>Surname :<input type = "text" name = "surname"></p>
    <p>Years :<input type = "number" name = "years"></p>
<%--    Кнопка с надписью Pass data, после нажатия которой выполняется передача данных методом Post--%>
    <input type="submit" value="Pass data">
</form>
</body>
</html>
