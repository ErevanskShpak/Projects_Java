import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class GetCookies extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        for(Cookie cookie : cookies) {
            pw.println("<h1>" + cookie.getName() + ": " + cookie.getValue() + "</h1>");
        }
        pw.println("</html>");
    }
}
