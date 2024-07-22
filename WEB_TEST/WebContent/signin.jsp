<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css" />
	<%
	boolean failedLogin = false;
	if (request.getSession().getAttribute("failedLogin") != null) failedLogin = (boolean)request.getSession().getAttribute("failedLogin"); 
	%>
</head>
<body>
	<main class="container">
		<%if(failedLogin){%>
		<article>
			<strong>El usuario ingresado no es válido</strong>
		</article>
		<%}%>
		<form action="signin" method="post">
			<article>
				<fieldset>
					<label> User <input name="user" placeholder="User"
						autocomplete="username" />
					</label>
					<label> Password <input type="password" name="password"
						placeholder="Password" />
					</label>
				</fieldset>
				<footer>
					<input type="submit" value="Sign in" />
				</footer>
			</article>
		</form>
	</main>
</body>
</html>