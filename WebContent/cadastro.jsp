<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cadastro - RPG UCSal</title>
	</head>
	<body>
		<form action="CadastroServlet" method="post">
			Usuário: <input type="text" name="usuario"> <br>
			Senha: <input type="password" name="senha"> <br>
			Nome: <input type="text" name="nome"> <br>
			Idade: <input type="number" name="idade"> <br>
			E-mail: <input type="email" name="email"> <br>
			<input type="submit" value="Criar Conta" onclick="msg()">	
		</form>
		
		<script>
			function msg() {
			    alert("Conta Criada!");
			}
		</script>
		
	</body>
</html>