<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/guestbook3/guestbook/insert" method="post">
		<table border="1">
		<colgroup>
	  		<col style = "width : 50px">
	  		<col style = "width : 150px">
	  		<col style = "width : 100px">
	  		<col style = "width : 150px">
		</colgroup>
			<tr>
				<td>이름</td>
				<td><input type= "text" name="name"></td>
				<td>비밀번호</td>
				<td><input type= "password" name="pw"></td>
			</tr>
			<tr>
				<td colspan="4"><textarea style = "width:98%;" rows="5" name = "content">방명록 적어주세요!</textarea></td>
			</tr>
			<tr>
				<td colspan="4">
					<button type= "submit">확인</button>
				</td>
			</tr>
		</table>
	</form>
	<br>
	
	<c:forEach items= "${guestlist}" var= "guest">
		<table border= "1">
		<colgroup>
	  		<col style = "width : 50px">
	  		<col style = "width : 100px">
	  		<col style = "width : 260px">
	  		<col style = "width : 100px">
		</colgroup>
			<tr>
				<td>${guest.ro}</td>
				<td>${guest.name}</td>
				<td>${guest.date}</td>
				<td>
					<a href= "/guestbook3/guestbook/deleteForm?no=${guest.no}">삭제</a>
				</td>
			</tr>
			<tr>
				<td colspan="4">${guest.content}</td>
			</tr>
		</table>
		<br>
	</c:forEach>	

	
</body>
</html>