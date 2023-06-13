<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>
<h1>List of employee : </h1>
${employees}

<br/>
<h2>To add new employee press "Add employee" button</h2>
<form method="post" action="/employee/add">

    <p><label for="name">Employee name </label></p>
    <p><input type="text" name="name" id="name"></p>
    <br/>

    <p><label for="position">Employee position </label></p>
    <p><input type="text" name="position" id="position"></p>
    <br/>

    <p><label for="phone">Employee phone </label></p>
    <p><input type="text" name="phone" id="phone"></p>

    <input type="submit" value="Add employee">
</form>
<%----------------------------------------------------------------------------------------------------------------%>
<br/>
<form method="post" action="/employee/findByName">
    <h2>Search employee by name</h2>
    <p>Name : </p>
    <p><input name="name" type="text"></p>
    <p><input type="submit" value="Search by name"></p>
</form>
<br/>
<br/>
<form method="post" action="/employee/findByNameAndPosition">
    <h2>Search employee by name and position</h2>
    <p>Name : </p>
    <p><input name="name" type="text"></p>
    <p>Position : </p>
    <p><input name="position" type="text"></p>
    <p><input type="submit" value="Search by name and position"></p>
</form>
<br/>
<br/>
<form method="post" action="/employee/findByNameAndPhone">
    <h2>Search employee by name and phone</h2>
    <p>Name : </p>
    <p><input name="name" type="text"></p>
    <p>Phone : </p>
    <p><input name="phone" type="text"></p>
    <p><input type="submit" value="Search by name and phone"></p>
</form>

</body>
</html>
