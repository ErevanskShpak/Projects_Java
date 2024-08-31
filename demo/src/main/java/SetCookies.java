import jakarta.servlet.http.*;

import java.io.IOException;

public class SetCookies extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie cookie1 = new Cookie("id", "001");
        Cookie cookie2 = new Cookie("name", "Tom");
        cookie1.setMaxAge(60*60);
        cookie2.setMaxAge(-1); //удалится при закрытии браузера
        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }
}
