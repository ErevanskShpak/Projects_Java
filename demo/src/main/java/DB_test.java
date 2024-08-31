import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DB_test extends HttpServlet {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "postgres";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        try(Connection connection = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            pw.println("<html>");
            while(resultSet.next()) {
                pw.println("<h1>" + resultSet.getInt("id") + " " +
                        resultSet.getString("name") + " " +
                        resultSet.getInt("age") + "</h1>");
            }
            pw.println("</html>");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
