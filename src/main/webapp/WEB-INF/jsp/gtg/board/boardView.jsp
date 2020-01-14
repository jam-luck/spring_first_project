<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글</title>
</head>
<body>
<h2>게시판</h2>

<div id="outter">
	<table>
		<tr>
			<td>No.</td>
			<td width="50%">제목</td>
			<td>작성자</td>
			<td>내용</td>
			<td>등록일</td>
			<td>조회수</td>		
		</tr>
			<tr>
				<td>${board.num }</td>
				<td>${board.title }</td>
				<td>${board.writer }</td>
				<td>${board.contents }</td>
				<td>${board.wdate }</td>
				<td>${board.count }</td>
			</tr>
	</table>
</div>
</body>
</html>