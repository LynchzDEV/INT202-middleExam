<%-- 65130500008 Jinnawat Vilairat --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.jinnawat.mid_exam_008.models.User" %>
<!DOCTYPE>
<html lang="en">
    <head>
        <title>Prime Number Checker</title>
    </head>
    <body>
        <h1 style="color: dimgray;">65130500008 Jinnawat Vilairat</h1>
        <%
            User user = (User) session.getAttribute("user");
        %>
        <h1 style="color: dimgray">
            Welcome ${user.getUsername()} (${user.getEmail()} )
        </h1>
        <hr/>
        <h1>Prime Checker::</h1>
        <hr/>
        <form action="PrimeCheckerServlet" method="post">
            <label for="num">Enter the number to check</label>
            <input type="text" name="num" id="num">
            <input type="submit" value="Submit">
        </form>
        <hr/>
        <h3>${displayResult}</h3>
    </body>
</html>
