<%@ page import="java.util.List" %>
<%@ page import="com.springdemo.model.UserVO" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2022-01-13
  Time: 오후 3:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
main
    <%
        List<UserVO> users = (List<UserVO>) request.getAttribute("userList");

    %>

</body>
</html>
