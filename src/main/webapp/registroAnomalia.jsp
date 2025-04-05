<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registrar Anomalía</title>
</head>
<body>
    <h2>Registro de Anomalía</h2>

    <form action="registrarAnomalia" method="post">
        <label>Descripción:</label><br>
        <textarea name="descripcion" required></textarea><br><br>

        <label>Fecha:</label><br>
        <input type="date" name="fecha" required><br><br>

        <label>ID de Usuario:</label><br>
        <input type="number" name="idUsuario" required><br><br>

        <input type="submit" value="Guardar Anomalía">
    </form>

    <%
        String msg = request.getParameter("msg");
        String error = request.getParameter("error");
        if ("anomalia_registrada".equals(msg)) {
    %>
        <p style="color: green;">¡Anomalía registrada correctamente!</p>
    <%
        } else if ("1".equals(error)) {
    %>
        <p style="color: red;">Error al registrar la anomalía.</p>
    <%
        }
    %>

</body>
</html>
