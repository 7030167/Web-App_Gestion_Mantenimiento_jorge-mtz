<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, com.mycompany.gestionmantenimientoapp.TareaMantenimiento" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tareas Programadas</title>
</head>
<body>
    <h2>Lista de Tareas Programadas</h2>

    <%
        ArrayList<TareaMantenimiento> tareas = (ArrayList<TareaMantenimiento>) request.getAttribute("tareas");
        if (tareas != null && !tareas.isEmpty()) {
    %>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Descripción</th>
                <th>Estado</th>
                <th>Fecha Programada</th>
                <th>ID Anomalía</th>
            </tr>
            <%
                for (TareaMantenimiento t : tareas) {
            %>
            <tr>
                <td><%= t.getId() %></td>
                <td><%= t.getDescripcion() %></td>
                <td><%= t.getEstado() %></td>
                <td><%= t.getFechaProgramada() %></td>
                <td><%= t.getIdAnomalia() %></td>
            </tr>
            <% } %>
        </table>
    <%
        } else {
    %>
        <p>No hay tareas programadas.</p>
    <%
        }
    %>

</body>
</html>

