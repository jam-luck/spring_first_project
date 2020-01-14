<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기</h1><br>
	<form action="boardWriteFunction.do" method="post">
	제목 : <input type="text" name="title"> <br>
	내용: <input type="text" name="contents" style="width:200px; height:50px"> <br>
	<input type="submit">
	
	</form>
</body>
</html>