package com.example.meeting_8;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "quoteServlet", value = "/quote-servlet")
public class QuoteServlet extends HttpServlet {
    private String quote;

    public void init(){
        quote = "Bad programmers worry about the code. Good programmers worry about data structures and their \n" +
                "relationships";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Цитата Линуса Торвальдса</title></head><body>");
        out.println("<h1>Цитата Линуса Торвальдса:</h1>");
        out.println("<p>" + quote + "</p>");
        out.println("</body></html>");
    }
}
