<% 
if (session.getAttribute("usuario") == null) {
    response.sendRedirect("index.jsp");
}
%>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Iniciar sesi�n</h2>
    <form method="post" action="login">
        Correo: <input type="text" name="correo"><br>
        Contrase�a: <input type="password" name="contrasena"><br>
        <button type="submit">Entrar</button>
    </form>
</body>
</html>
