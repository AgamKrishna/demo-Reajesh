<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Doctor Registration Form</h1>
	<form action="seeform" method="POST">

		<table>
			<tr>
				<td>PatientName:</td>
				<td><input type="text" name="pNm"></td>
			</tr>
			<tr>
				<td>PatientNumber:</td>
				<td><input type="text" name="pNo"></td>
			</tr>
			<tr>
				<td>PatientProblm:</td>
				<td><input type="text" name="pblm"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>

           <tr>
				<td>Password:</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
			<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>

</body>
</html>