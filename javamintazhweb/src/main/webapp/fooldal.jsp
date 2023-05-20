<%--
  Created by IntelliJ IDEA.
  User: Péter
  Date: 2023. 05. 20.
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%--írja ki a bejelentkezési e-mail címet, majd egy táblázatban sorolja--%>
<%--fel a lehetséges időpontok címkéit és állapotát: szabad/foglalt. Továbbá,--%>
<%--egy „akció linket”, amely üres, ha a terem már foglalt más által (nem--%>
<%--egyező e-mail cím), Foglalás link, ha még szabad, illetve Törlés link, ha a--%>
<%--felhasználó saját maga foglalta le a termet korábban.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fő oldal</title>
</head>
<body>
<h1>Próbaterem foglalások</h1><br>
<%
    String email = (String) request.getSession().getAttribute("email");
%>
<p>Bejelentkezve mint: <%=email%></p>
</body>
</html>
