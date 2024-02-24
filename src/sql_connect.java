import java.sql.*;

public class sql_connect {
    private static final String URL = "jdbc:postgresql://localhost/podcasts";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1453";

    public static Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        return conn;
    }
}
