package com.example.javamintazhweb;

import oe.java.probaterem.model.Idopont;
import oe.java.probaterem.model.Probaterem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletProbaterem", value = "/ServletProbaterem")
public class ServletProbaterem extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = (String) request.getSession().getAttribute("email");
        Probaterem probaterem = (Probaterem) request.getServletContext().getAttribute("probaterem");
        List<Idopont> idopontok = probaterem.getIdopontok();

        if (request.getParameter("foglal") != null){
            Idopont i = idopontok.stream().filter(idopont -> idopont.getAzonosito().equals(request.getParameter("foglal"))).findFirst().orElse(null);
            if (i != null){
                probaterem.Foglal(email, i);
            }
        }

        if (request.getParameter("torol") != null){
            Idopont i = idopontok.stream().filter(idopont -> idopont.getAzonosito().equals(request.getParameter("torol"))).findFirst().orElse(null);
            if (i != null){
                probaterem.Torol(email, i);
            }
        }


    }
}
