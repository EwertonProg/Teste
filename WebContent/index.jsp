<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="br.instituto.modelo.cadastro.Jovem"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<%
	if (application.getAttribute("listaJovens") == null) {
		application.setAttribute("listaJovens", new ArrayList<Jovem>());
	}
%>
<title>Cadastrar</title>
</head>
<body>
	<form class="needs-validation was-validated" method="post"
		action="/Teste/CadastrarJovem">
		<div class="order-md-1" align="center">
			<h2 class="mb-3">Cadastrar Jovem</h2>
			<div class="col-md-4 mb-3 row">
				Nome:<input type="text" name="nome" required class="form-control"></input><br>
				Data de Nascimento:<input type="date" name="dataNas" required class="form-control"></input><br> 
				RG:<input type="text" name="rg" class="form-control" data-mask="00.000.000-00" required></input><br>
			</div>
			<button class="btn btn-primary btn-lg" type="submit" name="save">Salvar</button>
		</div>
	</form>

	<script async="" src="//www.google-analytics.com/analytics.js"></script>
	<script type="text/javascript"
		src="//code.jquery.com/jquery-2.0.3.min.js"></script>
	<script type="text/javascript"
		src="//assets.locaweb.com.br/locastyle/2.0.6/javascripts/locastyle.js"></script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>