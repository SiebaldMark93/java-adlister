<%--
  Created by IntelliJ IDEA.
  User: marksiebald
  Date: 7/13/22
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="partials/navbar.jsp" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post">

    <div class="container">
        <label> <b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="name" required>

        <label><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required>

        <button type="submit">Login</button>
    </div>


</form>

</body>
</html>
