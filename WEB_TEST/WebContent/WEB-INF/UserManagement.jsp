<%@ page import="entities.User" %>
<%@ page import="java.util.LinkedList" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<link
			rel="stylesheet"
			href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
		/>
		<title>Home</title>

		<%
			User user = (User)session.getAttribute("user");
			LinkedList<User> users = (LinkedList<User>)request.getAttribute("users");
		%>

	</head>
	<body>
		<main class="container">
		
		<p>DEDEDE</p>
			<article>
			SASASA
			</article>
			
			<table>
				<thead>
					<tr>
						<th scope="col">Name</th>
						<th scope="col">Password</th>
					</tr>
				</thead>
				<tbody>
					<% for (User usr : users) {%>
					<tr>
						<th scope="row"><%=usr.getUser() %></th>
						<td><%=usr.getPassword() %></td>
					</tr>
					<% } %>
				</tbody>
			</table>
		</main>
	</body>
</html>