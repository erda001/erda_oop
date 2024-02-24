import java.sql.*;

public class Table {
    public static void table(){
    try (
      Connection conn = sql_connect.connect();
      Statement stmt = conn.createStatement();
    ) {
      String command =
        "CREATE TABLE IF NOT EXISTS Podcasts " +
        "(id SERIAL PRIMARY KEY, " +
        "title VARCHAR(255) NOT NULL, " +
        "author VARCHAR(255) NOT NULL, " +
        "playlist VARCHAR(255) NOT NULL, " +
        "duration VARCHAR(255) NOT NULL," + 
        "type VARCHAR(255) NOT NULL," + 
        "likes INT);";

      stmt.executeUpdate(command);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
