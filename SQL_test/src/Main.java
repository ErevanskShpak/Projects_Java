import java.sql.*;

public class Main {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "postgres";

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement()) {
            System.out.println("Connection Established!");

            statement.executeUpdate("DROP TABLE IF EXISTS users");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(255), " +
                    "age INT)");
            statement.execute("INSERT INTO users VALUES (1, 'John', 18)");
            statement.execute("INSERT INTO users VALUES (2, 'Jane', 20)");
            statement.execute("INSERT INTO users VALUES (3, 'Bob', 16)");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while(resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " +
                        resultSet.getString("name") + " " +
                        resultSet.getInt("age") +
                        "\n----------------\n");
            }

            PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO users VALUES (4, 'Andro', 18)");
            preparedStatement1.execute();

            PreparedStatement preparedStatement2 = connection.prepareStatement("INSERT INTO users VALUES (?, ?, ?)");
            preparedStatement2.setInt(1, 5);
            preparedStatement2.setString(2, "Niko");
            preparedStatement2.setInt(3, 22);
            preparedStatement2.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}