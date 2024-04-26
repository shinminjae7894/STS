<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>좋아하는 음식</h2>
	<c:forEach var="i" items="${foods}">
		${i}<br>
	</c:forEach>
	<br><br>
	<h2>좋아하는 과일</h2>
	${f1}, ${f2}, ${f3}
	<br><br>
	나는 ${day[0]}에 ${movie[2]}를 관람하였다.
</body>
</html>