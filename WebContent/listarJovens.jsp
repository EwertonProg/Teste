<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.instituto.modelo.cadastro.Jovem" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Listar Jovens</title>
</head>
<body>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Nome</th>
				<th scope="col">Nascimento</th>
				<th scope="col">RG</th>
				<th scope="col"></th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<%
			if(application.getAttribute("listaJovens")==null){
				application.setAttribute("listaJovens", new ArrayList<Jovem>());}
				
			List<Jovem> jovens = (ArrayList<Jovem>) application.getAttribute("listaJovens");
			int i=1;
			for(Jovem jovem : jovens){
			%>
				<tr>
					<th scope="row"><%=i %></th>
					<td><%=jovem.getNomeCompleto() %></td>
					<td><%=jovem.getDataNascimento() %></td>
					<td><%=jovem.getRg() %></td>
					<td><a href="Deletar?id=<%=jovem.getRg()%>">Deletar</a><br> </td>
					<td><a href="Atualizar?id=<%=jovem.getRg()%>">Atualizar</a></td>
					
				</tr>
			<%i++;} %>
		</tbody>
	</table>
<a type="button" class="btn btn-primary btn-block text-white" href="/Teste">Adicionar</a>

</body>
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
</html>