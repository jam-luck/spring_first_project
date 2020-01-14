<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script language="javascript">
if(${temp} == 1) {
	alert("로그인에 성공하셨습니다.");
	document.location.href="../board/boardPaging.do";
}
else {
	alert("계정이나 비밀번호를 확인해주세요.");
	document.location.href="index.do";
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