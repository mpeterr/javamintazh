<%@ page import="oe.java.probaterem.model.Idopont" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.InvalidPropertiesFormatException" %>
<%@ page import="oe.java.probaterem.model.UserListener" %>
<%@ page import="oe.java.probaterem.model.Probaterem" %>
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
<h1>Próbaterem foglalások</h1>
<%
    String email = (String) request.getSession().getAttribute("email");
    Probaterem probaterem = (Probaterem) request.getServletContext().getAttribute("probaterem");
%>
<p>Bejelentkezve mint: <%=email%></p><br>
<table border="1">
    <tr>
        <td>Időpont</td><td>Állapot</td><td>Foglalás</td>
    </tr>
    <%
        for (Idopont idopont : probaterem.getIdopontok()){
            %>
    <tr>
            <td><%=idopont.getCimke()%></td>
            <td>
                <%
                    if(idopont.getFoglalas() == null){
                    %>
                        Szabad
                    <%
                    }
                    else
                    {
                    %>
                        Foglalt
                    <%
                    }
                %>
            </td>
            <td>
                <%
                    if(idopont.getFoglalas() == null){//itt jön majd a href-es gombos rész
                %>
                <a href="ServletProbaterem?foglal=<%=idopont.getAzonosito()%>">Foglal</a>
                <%
                }
                else
                {
                %>
                <a href="ServletProbaterem?torol=<%=idopont.getAzonosito()%>">Törlés</a>
                <%
                    }
                %>
            </td>
    </tr>
            <%
        }
    %>
</table>
</body>
</html>
