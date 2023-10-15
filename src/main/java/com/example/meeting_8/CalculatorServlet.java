package com.example.meeting_8;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculatorServlet", value = "/calculator-servlet")
public class CalculatorServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/calculator.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operation = request.getParameter("operation");

        try{
            double numInt1 = Double.parseDouble(num1);
            double numInt2 = Double.parseDouble(num2);
            double result = 0;

            switch (operation){
                case "add":{
                    result = numInt1 + numInt2;
                    break;
                }
                case "subtract":{
                    result = numInt1 - numInt2;
                    break;
                }
                case "multiply":{
                    result = numInt1 * numInt2;
                    break;
                }
                case "divide":{
                    if(numInt2 != 0){
                        result = numInt1 / numInt2;
                    }else{
                        out.println("<html><head>" +
                                "<title>Max number</title>" +
                                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                                "          integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">" +
                                "</head><body>");
                        out.println("<div class='container'>");
                        out.println("<p>Error: Division by zero</p>");
                        out.println("<div><button class='btn btn-outline-primary'><a href='calculator-servlet'>Back</a></button></div>");
                        out.println("</div>");
                        return;
                    }
                    break;
                }
                case "pow":{
                    result = Math.pow(numInt1, numInt2);
                    break;
                }
                case "percentage":{
                    result = (numInt1 * numInt2) / 100;
                    break;
                }
            }

            out.println("<html><head>" +
                    "<title>Max number</title>" +
                    "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                    "          integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">" +
                    "</head><body>");
            out.println("<div class='container'>");
            out.println("<p>Result: " + result + "</p>");
            out.println("<div><button class='btn btn-outline-primary'><a href='calculator-servlet'>Back</a></button></div>");
            out.println("</div>");

        }catch (NumberFormatException e){
            out.println("<p>Error: Invalid number format</p>");
        }
    }
}
