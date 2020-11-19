<%-- 
    Document   : listar
    Created on : 19/11/2020, 19:25:09
    Author     : anderson
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Time"%>
<%@page import="dao.TimeDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

            <%
                TimeDAO banco = new TimeDAO();
                Time time;

                ArrayList brasileirao = banco.listar();

                out.println("<table border=1>");
                out.println("<tr><td>Índice</td><td>Time</td><td>Atleta</td></tr>");

                for (int i = 0; i < brasileirao.size(); i++) {
                    time = (Time) brasileirao.get(i);
                    out.println("<tr><td>" + time.getIndice() + "</td>"
                            + "<td>" + time.getNome() + "</td>"
                            + "<td>" + time.getAtleta() + "</td></tr>");
                }
                out.println("</table>");
            %>    
            <a href=".">Retornar para a primeira página</a>     



    </body>
</html>
