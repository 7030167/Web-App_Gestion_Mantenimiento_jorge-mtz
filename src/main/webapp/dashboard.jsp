<% 
if (session.getAttribute("usuario") == null) {
    response.sendRedirect("index.jsp");
}
%>

<%
String usuario = (String) session.getAttribute("usuario");
if (usuario == null) {
    response.sendRedirect("index.jsp");
}
%>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h2>Bienvenido, <%= usuario %></h2>
    <a href="registroAnomalia.jsp">Registrar Anomalía</a><br>
    <a href="tareasProgramadas.jsp">Ver Tareas</a>
</body>
</html>
