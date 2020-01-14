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
	<form action="boardWriteFunction.do" method="post" id="writeform">
	제목 : <input type="text" name="title"> <br>
	내용: <textarea name="contents" form="writeform" cols="80" row="80"></textarea> <br>
	<input type="submit">
	
	</form>
</body>
</html>