<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello world</h2>
	
	<ul>
		<li><a href="/webproject2/first">first.jsp로 이동</a></li>
		<li><a href="/webproject2/second?p1=applepie&p2=grapejuice">second.jsp로 이동</a></li>
	</ul>
	<br><br>
	<form method="post" action="/webproject2/third">
		이름 : <input type="text" name="name" /><br>
		나이 : <input type="text" name="age" /><br>
		점수 : <input type="text" name="point" /><br>
		<input type="submit" value="전송" /><br>
	</form>
	<br><br>
	<form method="get" action="/webproject2/fourth">
		이름 : <input type="text" name="name" /><br>
		나이 : <input type="text" name="age" /><br>
		점수 : <input type="text" name="point" /><br>
		전화번호 : <input type="text" name="tel" /><br>
		<input type="checkbox" name="chk" value="yes" />동의 여부<br>
		<input type="submit" value="전송" /><br>
	</form>
</body>
</html>