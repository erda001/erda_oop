import java.sql.*;

public class Show_all_podcast { //Method used to show whole library

  public void get_all_podcasts() {
    String command = "SELECT * FROM Podcasts";

    try (
      Connection conn = sql_connect.connect();
      Statement statement = conn.createStatement();
      ResultSet resultSet = statement.executeQuery(command)
    ) {
      while (resultSet.next()) {
        System.out.println(
          resultSet.getInt("id") + "|" +
          resultSet.getString("title") + "  (" +
          resultSet.getString("author") + "  |  " +
          resultSet.getString("playlist") + "  |  " +
          resultSet.getString("duration") + "  |  " +
          resultSet.getString("type") + " | " + 
          resultSet.getInt("likes") + ")"
        );
      }
    } 
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}