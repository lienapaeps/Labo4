package ui.controller;

import domain.model.LetterCounter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Occurences")
public class Occurences extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        char letter = request.getParameter("letter").charAt(0);
        String woord = request.getParameter("woord");

        int aantalLetters = LetterCounter.countLetters(woord, letter);

        request.setAttribute("aantalKeer", aantalLetters);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
