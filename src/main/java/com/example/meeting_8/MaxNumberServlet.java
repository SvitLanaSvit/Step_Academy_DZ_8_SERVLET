package com.example.meeting_8;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "maxNumberServlet", value = "/max-number-servlet")
public class MaxNumberServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/numberForm.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String num3 = request.getParameter("num3");
        String action = request.getParameter("action");

        int numInt1 = Integer.parseInt(num1);
        int numInt2 = Integer.parseInt(num2);
        int numInt3 = Integer.parseInt(num3);

        int result = 0;

        switch (action){
            case "max":{
                result = Math.max(numInt1, Math.max(numInt2, numInt3));
                break;
            }
            case "min":{
                result = Math.min(numInt1, Math.min(numInt2, numInt3));
                break;
            }
            case "avg":{
                result = (numInt1 + numInt2 + numInt3) / 3;
                break;
            }
        }

        out.println("<html><head>" +
                "<title>Max number</title>" +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                        "          integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">" +
                "</head><body>");
        out.println("<div class='container'>");
        out.println("<p>First number: " + num1 + "</p>");
        out.println("<p>Second number: " + num2 + "</p>");
        out.println("<p>Third number: " + num3 + "</p>");
        out.println("<p>Result by " + action + ": " + result + "</p>");
        out.println("</div>");
    }
}
