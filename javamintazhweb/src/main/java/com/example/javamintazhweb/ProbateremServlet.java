package com.example.javamintazhweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProbateremServlet", value = "/ProbateremServlet")
public class ProbateremServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        request.getSession().setAttribute("email", email);
        request.getRequestDispatcher("fooldal.jsp").forward(request, response);
    }
}
