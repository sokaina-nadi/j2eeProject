<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenue a gestiobiblio</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="style/NewFile.css" rel="stylesheet">
</head>
<body>
	<form action="testsev" method="post">
		<table>
			<tr>
				<th>login:</th>
				<th><input type="text" name="log" /><br /></th>
			</tr>
			<tr>
				<th>password:</th>
				<th><input type="password" name="pass" /><br /></th>
			</tr>
			<tr>
				<th></th>
				<th><input type="submit" value="se connecter" /></th>
			</tr>

		</table>
	</form>
	<hr />

	<form action="addStudent" method="post">
		<table>
			<tr>
				<th>fullname:</th>
				<th><input type="text" name="full_name" /><br /></th>
			</tr>
			<tr>
				<th>login:</th>
				<th><input type="text" name="log" /><br /></th>
			</tr>
			<tr>
				<th>password:</th>
				<th><input type="password" name="pass" /><br /></th>
			</tr>

			<tr>
				<th></th>
				<th><input type="submit" value="s'identifier" /></th>
			</tr>
		</table>
	</form>
	<!-- some js put there -->
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.js"></script>

</body>
</html>