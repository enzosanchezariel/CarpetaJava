<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<title>WebQuizApp</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"/>
		<link rel="stylesheet" href="style/index.css" />
	</head>
	<body>
		<header class="container">
			<nav>
				<ul>
                    <li><a href="#" class="secondary">
                        <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-menu-2" width="24" height="24" viewBox="0 0 24 24" stroke-width="1.5" stroke="#2c3e50" fill="none" stroke-linecap="round" stroke-linejoin="round">
                            <path stroke="none" d="M0 0h24v24H0z" fill="none"/>
                            <path d="M4 6l16 0" />
                            <path d="M4 12l16 0" />
                            <path d="M4 18l16 0" />
                        </svg>
                    </a></li>
					<li><strong>TpJava WebQuizApp</strong></li>
				</ul>
				<ul>
                    <li><a href="signin.html" class="secondary">
                        <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-user" width="24" height="24" viewBox="0 0 24 24" stroke-width="1.5" stroke="#2c3e50" fill="none" stroke-linecap="round" stroke-linejoin="round">
                            <path stroke="none" d="M0 0h24v24H0z" fill="none"/>
                            <path d="M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0" />
                            <path d="M6 21v-2a4 4 0 0 1 4 -4h4a4 4 0 0 1 4 4v2" />
                        </svg>
                    </a></li>
                </ul>
			</nav>
		</header>
		<main class="container">
			<% if (request.getSession().getAttribute("user") != null){%>
	            <div class="grid">
	                <div>
	                    <article>
	                        <strong>Únete a una sala</strong>
	                        <footer>
	                            <input type="text" name="code" placeholder="Código" aria-label="Text"/>
	                        </footer>
	                    </article>
	                </div>
	                <div>
	                    <article>
	                        <strong>Crea una sala</strong>
	                        <footer><button class="btn">Crear</button></footer>
	                    </article>
	                </div>
	            </div>
	        <%}else{%>
	        	<article>
	        		<strong>Inicie sesión</strong>
	        		<footer>Para crear o unirse a una sala, debe tener una cuenta e iniciar sesión.</footer>
	        	</article>
	        <%}%>
		</main>
	</body>
</html>