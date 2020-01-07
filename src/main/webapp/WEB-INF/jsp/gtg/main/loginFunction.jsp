<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script language="javascript">
if(${temp} == 1) {
	alert("로그인에 성공하셨습니다.");
	document.location.href="tt.do";
}
else {
	alert("계정이나 비밀번호를 확인해주세요.");
	document.location.href="tt.do";
}
</script>   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
</body>
</html>