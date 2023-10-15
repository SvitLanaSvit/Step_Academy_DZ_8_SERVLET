package com.example.meeting_8;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

@WebServlet(name = "textServlet", value = "/text-servlet")
public class TextServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/textInput.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String text = request.getParameter("textInput");

        int vowelCount = 0;
        int consonantCount = 0;
        int punctuationCount = 0;
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();
        List<Character> punctuationMarks = new ArrayList<>();

        for (char c : text.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) >= 0) {
                vowelCount++;
                vowels.add(c);
            } else if (Character.isLetter(c)) {
                consonantCount++;
                consonants.add(c);
            } else if (Character.isWhitespace(c)) {
                //skip
            }else {
                punctuationCount++;
                punctuationMarks.add(c);
            }
        }

        out.println("<html><head>" +
                "<title>Max number</title>" +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                "          integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">" +
                "</head><body>");
        out.println("<div class='container'>");
        out.println("<p>Text: " + text + "</p>");

        out.println("<table class=\"table table-striped table-hover\">");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th>Number of vowels</th>");
        out.println("<th>List of vowels</th>");
        out.println("<th>Number of consonants</th>");
        out.println("<th>List of consonants</th>");
        out.println("<th>Number of punctuation marks</th>");
        out.println("<th>List of punctuation marks</th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");
        out.println("<tr>");
        out.println("<td>" + vowelCount + "</td>");
        out.println("<td>" + vowels + "</td>");
        out.println("<td>" + consonantCount + "</td>");
        out.println("<td>" + consonants + "</td>");
        out.println("<td>" + punctuationCount + "</td>");
        out.println("<td>" + punctuationMarks + "</td>");
        out.println("</tr>");
        out.println("</tbody>");
        out.println("</table>");
        out.println("</div>");
    }
}
