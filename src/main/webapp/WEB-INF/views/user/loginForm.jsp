<%--
  Created by IntelliJ IDEA.
  User: shlee
  Date: 2021/08/16
  Time: 5:59 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<script>


</script>
<body>
    <h3>로그인</h3>
    <form action="/loginProcess" method="post">
        <input type="text" name="loginId" placeholder="아이디 입력">
        <input type="password" name="password" placeholder="비밀번호 입력">
        <button type="submit">로그인</button>
    </form>
    <a type="button" href="/user/signupForm">회원가입</a>
</body>
</html>
