package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Java Web Application</title>");
            out.println("<style>");
            out.println("body { font-family: Arial; background: #f0f2f5; text-align: center; padding: 50px; }");
            out.println(".container { background: white; padding: 30px; border-radius: 10px; display: inline-block; }");
            out.println("h1 { color: #1565c0; }");
            out.println("</style>");
            out.println("</head>");

            out.println("<body>");
            out.println("<div class='container'>");

            out.println("<h1>Welcome to My Java Web Application!</h1>");
            out.println("<h2>Successfully Deployed Using Jenkins CI/CD</h2>");

            out.println("<p><b>Application:</b> Java Web Application</p>");
            out.println("<p><b>Java Version:</b> " + System.getProperty("java.version") + "</p>");
            out.println("<p><b>Server:</b> Apache Tomcat</p>");
            out.println("<p><b>Current Time:</b> " + LocalDateTime.now() + "</p>");

            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
