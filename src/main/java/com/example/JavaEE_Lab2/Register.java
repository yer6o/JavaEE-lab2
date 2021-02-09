package com.example.JavaEE_Lab2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Register", value = "/register-action")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<h2>Welcome " + first_name + " " + last_name + "! Your username: " + username + "</h2>");
            out.println("<span>Your password:  " + password + "</span>");
            out.println("</html>");
        }
}