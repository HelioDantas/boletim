<%-- 
    Document   : resposta
    Created on : 22/05/2019, 21:17:25
    Author     : 2017101680
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String av1 = (String) request.getAttribute("av1").toString();
            String av2 = (String) request.getAttribute("av2").toString();
            String av3 = (String) request.getAttribute("av3").toString();
            String media = (String) request.getAttribute("media").toString();
            String status = (String) request.getAttribute("status").toString();
        %>

        <%= "AV1 " + av1%><br>
        <%= "AV2 " + av2%><br>
        <%= "AV3 " + av3%><br>
        <%= "media " + media%><br>
        <%= "status " + status%><br>
    </body>
</html>
