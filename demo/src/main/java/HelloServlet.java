import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Hello " + name + " " + surname + " and Obama" + "</h1>");
        out.println("</body></html>");

        //response.sendRedirect("/FirstJSP.jsp");

        //RequestDispatcher dispatcher = request.getRequestDispatcher("/FirstJSP.jsp");
        //dispatcher.forward(request, response);
    }

    public void destroy() {
    }
}