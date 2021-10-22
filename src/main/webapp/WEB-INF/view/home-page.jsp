<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1 align="center">Calculator</h1>
	
	<form action="process-homepage" method="get">
		<div align="center">
			<p>
				<label>Your name : </label>
				<input type="text" name="name" />
			</p>
			
			<p>
				<label>Crush name : </label>
				<input type="text" name="crushName" />
			</p>
			<input type="submit" value="calculate">
		</div>
	</form>
	
</body>
</html>