import SomePackage.Cart;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setSurname(surname);
            cart.setPrice(0);
        }
        cart.setPrice(cart.getPrice()+100);
        session.setAttribute("cart", cart);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Hello " + cart.getName() + " " + cart.getSurname() + "</h1>");
        out.println("</body></html>");

        response.sendRedirect("/session-jsp");
    }
}
