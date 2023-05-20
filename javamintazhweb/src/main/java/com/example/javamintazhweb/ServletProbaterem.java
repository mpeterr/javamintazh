package com.example.javamintazhweb;

import oe.java.probaterem.model.Probaterem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletProbaterem", value = "/ServletProbaterem")
public class ServletProbaterem extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = (String) request.getSession().getAttribute("email");
        Probaterem probaterem = (Probaterem) request.getServletContext().getAttribute("probaterem");
        
    }
}
