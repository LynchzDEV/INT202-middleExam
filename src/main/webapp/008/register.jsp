<%--65130500008 Jinnawat Vilairat--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html lang="en">
    <head>
        <title>Register</title>
    </head>
    <body>
        <h1 style="color: dimgray;">65130500008 Jinnawat Vilairat</h1>
        <hr/>
        <h1>Registration</h1>
        <form action="RegisterServlet" method="post">
            <label for="username">Username: </label>
            <input type="text" name="username" id="username" required>
            <label for="email">Email: </label>
            <input type="text" name="email" id="email" required>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
