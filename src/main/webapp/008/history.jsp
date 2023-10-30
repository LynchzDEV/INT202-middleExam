<%-- 65130500008 Jinnawat Vilairat --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.jinnawat.mid_exam_008.models.User, com.jinnawat.mid_exam_008.models.ResultList, java.util.List" %>
<%@ page import="com.jinnawat.mid_exam_008.models.Result" %>

<!DOCTYPE>
<html lang="en">
    <head>
        <title>Result History</title>
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
        <h1>Result History</h1>
        <table>
            <tr>
                <th>No:</th>
                <th>Number:</th>
                <th>Is Prime?</th>
            </tr>
            <%
                ResultList resultList = (ResultList) session.getAttribute("resultList");
                if (resultList != null) {
                    List<Result> results = resultList.getAllResults();
                    for (Result r : results) {
            %>
            <tr>
                <td><%= r.getNo() %>
                </td>
                <td><%= r.getNumber() %>
                </td>
                <td><%= r.isPrime() %>
                </td>
            </tr>
            <% } %>
            <h3>Number of not prime = ${count}</h3>
            <% } else { %>
            <h1>NO RESULT HISTORY</h1>
            <% }%>

        </table>
    </body>
</html>
