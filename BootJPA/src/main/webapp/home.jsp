<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	addAlien
	<form action="addAlien">
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="submit"><br>
	</form>
	
	getAlien
	<form action="getAlien">
		<input type="text" name="aid"><br>
		<input type="submit"><br>
	</form>
	
	getFlexible
	<form action="getFlexible">
		<input type="text" name="aid"><br>
		<input type="text" name="field"><br>
		<input type="submit"><br>
	</form>
	
	queryByField
	<form action="queryByField">
		<input type="text" name="field"><br>
		<input type="submit"><br>
	</form>
	
	I love Arequipa V5.0 <br>
	alien.aid, alien.aname, alien.lang
</body>
</html>