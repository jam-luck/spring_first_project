<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>index</title>
</head>
<body>
<h1>이것은 index입니다. </h1>
<form action="loginFunction.do" method="post">
        아이디 : <input type="text" name="id" size"20"> <br />
        비밀번호 : <input type="password" name="password" size"20"><br />
        <input type="submit" value="로그인">
	<input type="button" value="회원가입" onclick="location.href='signUp.do'">
</form>
    <c:if test="${userId eq null}">
        <a href="https://kauth.kakao.com/oauth/authorize?client_id=deb10b65101c30a76ad15f71bcda8d68&redirect_uri=http://localhost:8080/gtg/main/kakaoLogin.do&response_type=code">
        <img src="../resources/images/kakao_account_login_btn_medium_narrow.png">
        </a>
    </c:if>
    <c:if test="${userId ne null}">
        <h1>로그인 성공입니다</h1>
    </c:if>
</body>
</html>