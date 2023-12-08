package util;

import jakarta.servlet.http.HttpSession;

public class Util {
    public void count(HttpSession session) {
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 0);
        } else {
            session.setAttribute("count", count + 1);
        }
    }
}
