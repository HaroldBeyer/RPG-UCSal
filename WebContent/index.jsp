<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login - RPG UCSal</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	</head>
	<body>		
		<h1>P�gina Inicial - RPG</h1>
		<form action="LoginServlet" method="post">
			Usu�rio: <input type="text" name="usuario"> <br>
			Senha: <input type="password" name="senha"> <br>
			<input type="submit" class="btn btn-dark" value="Entrar">		
		</form>
		
		<a href="cadastro.jsp">Criar Conta</a>
	</body>
</html>