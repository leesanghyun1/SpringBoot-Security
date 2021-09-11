<%--
  Created by IntelliJ IDEA.
  User: shlee
  Date: 2021/08/21
  Time: 3:56 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>

<script>


</script>
<body>
    <h3>회원가입</h3>

    <table>

    <form action="/user/signup" method="post">
        <input type="text" name="loginId" placeholder="아이디 입력"><br/>
        <input type="password" name="password" placeholder="비밀번호 입력">
        <input type="password" name="password2" placeholder="비밀번호 확인"><br/>
        <input type="text" name="name" placeholder="이름"><br/>
        <input type="text" name="mobileNo" placeholder="핸드폰 번호"><br/>
        <input type="text" name="address" placeholder="주소"><br/>
        <input type="text" name="email" placeholder="이메일"><br/>
        <input type="text" name="birth" placeholder="생년월일"><br/>
        <button type="submit">회원가입</button>
    </form>
    </table>
</body>
</html>
