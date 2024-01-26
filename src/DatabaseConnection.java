import java.sql.*;
import java.util.Properties;

public class DatabaseConnection
{
    private final String username = "root";
    private final String password = "";
    private Connection connection;

    public Connection getConnection(String databaseName)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties adminCredentials = new Properties();
            adminCredentials.put("user", username);
            adminCredentials.put("password", "");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, adminCredentials);
            System.out.println("Connected to " + databaseName + " successfully!");
        }
        catch (SQLException | ClassNotFoundException exception)
        {
            exception.printStackTrace();
        }
        return connection;
    }
}
