<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="/guestbook3/guestbook/delete" method="post"> 
		비밀번호: <input type= "password" name="pw">
		<input type = "hidden" name = "no" value = "${no}">
 		<button type="submit">확인</button>
		</form>
		<p><a href ="/guestbook3/guestbook/main" >메인으로 돌아가기</a></p>
</body>
</html>