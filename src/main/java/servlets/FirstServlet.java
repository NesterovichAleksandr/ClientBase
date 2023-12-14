package servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import util.Util;
import util.database.DB;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        new Util().count(session);
        PrintWriter writer = resp.getWriter();
        writer.println(DB.getStringTable(Objects.requireNonNull(DB.getDataTable("customer"))));
        writer.println("count = " + session.getAttribute("count"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
    }

}
