package servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import run.Runner;
import util.Util;

import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        new Util().count(session);
        PrintWriter writer = resp.getWriter();
        writer.println(Runner.getCustomer());
        writer.println("count = " + session.getAttribute("count"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
    }

}
