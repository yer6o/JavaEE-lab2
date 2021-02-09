package com.example.JavaEE_Lab2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Login", value = "/login-action")
public class Login extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");


            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<h2>Hello " + username + ", nice to see you!</h2>");
            out.println("<span>Your password:  " + password + "</span>");
            out.println("</html>");



    }
}