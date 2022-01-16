<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2022-01-14
  Time: 오후 4:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>게시판</title>
</head>

<script type="text/javascript">
    $(document).ready(function(){
        let formObj = $("form[name='readForm']");

        //update
        $(".updateBtn").on("click",function(){
            formObj.attr("action","/board/updateView");
            formObj.attr("method","get");
            formObj.submit();
        })

        //delete
        $(".deleteBtn").on("click",function(){
            formObj.attr("action","/board/delete");
            formObj.attr("method","post");
            formObj.submit();
        })

        //cancel(go list)
        $(".listBtn").on("click",function(){
            location.href = "/board/list";
        })
    })
</script>
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
        <form name="readForm" role="form" method="post">
            <input type="hidden" id="bno" name="bno" value="${read.bno}" />
        </form>
        <table>
            <tbody>
            <tr>
                <td>
                    <label for="title">제목</label><input type="text" id="title" name="title" value="${read.title}" readonly="readonly" />
                </td>
            </tr>
            <tr>
                <td>
                    <label for="content">내용</label><textarea id="content" name="content" readonly="readonly"><c:out value="${read.content}" /></textarea>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="author">작성자</label><input type="text" id="author" name="author" value="${read.author}"  readonly="readonly"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label>작성날짜</label>
                    <fmt:formatDate value="${read.createdAt}" pattern="yyyy-MM-dd" />
                </td>
            </tr>
            </tbody>
        </table>
        <div>
            <button type="submit" class="updateBtn">수정</button>
            <button type="submit" class="deleteBtn">삭제</button>
            <button type="submit" class="listBtn">목록</button>
        </div>
    </section>
    <hr />
</div>
</body>
</html>