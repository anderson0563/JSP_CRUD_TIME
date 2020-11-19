<%-- 
    Document   : remover
    Created on : 19/11/2020, 19:11:07
    Author     : anderson
--%>

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
        <h1>
            <%
                request.setCharacterEncoding("UTF-8");
                String nome = request.getParameter("nome");

                TimeDAO banco = new TimeDAO();

                Time time = new Time(nome, "");

                int resultado = banco.remover(time);

                out.println("Registro(s) Alterado(s) no banco: " + resultado);
            %>    
           <a href=".">Retornar para a primeira página</a>     
        </h1>
    </body>
</html>
