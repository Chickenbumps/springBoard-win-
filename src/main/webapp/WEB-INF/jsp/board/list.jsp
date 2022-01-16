<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2022-01-14
  Time: 오후 4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>게시판</title>
</head>
<body>
<div id="root">
    <header>
        <h1> 게시판</h1>
    </header>
    <hr />

    <nav>
        홈 - 글 작성
    </nav>
    <hr />

    <section id="container">
            <table>
                <tr><th>번호</th><th>제목</th><th>작성자</th><th>등록일</th></tr>

                <c:forEach items="${list}" var = "list">
                    <tr>
                        <td><c:out value="${list.bno}" /></td>
                        <td>
                            <a href="/readView?bno=${list.bno}"><c:out value="${list.title}" /></a>
                        </td>
                        <td><c:out value="${list.author}" /></td>
                        <td><fmt:formatDate value="${list.createdAt}" pattern="yyyy-MM-dd"/></td>
                    </tr>
                </c:forEach>

            </table>
    </section>
    <hr />
</div>
</body>
</html>
