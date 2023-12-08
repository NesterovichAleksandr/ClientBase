import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import run.Runner;

import java.io.IOException;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println(Runner.getCustomer());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
    }
}
