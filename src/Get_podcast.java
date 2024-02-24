import java.sql.*;

public class Get_podcast {

  public void get_podcast(int id) {
    String command = "SELECT * FROM Podcasts WHERE id = " + id;

    try (
      Connection conn = sql_connect.connect();
      Statement statement = conn.createStatement();
      ResultSet resultSet = statement.executeQuery(command);
    ) {
      while (resultSet.next()) {
        System.out.println(
          "\nPodcast id: " + resultSet.getInt("id") + "\n" +
          "Podcast title: " + resultSet.getString("title") + "\n" +
          "Podcast author: " + resultSet.getString("author") + "\n" +
          "Playlist: " + resultSet.getString("playlist") + "\n" +
          "Duration: " + resultSet.getString("duration") + "\n" +
          "Format: " + resultSet.getString("type") + "\n" + 
          "Likes: " + resultSet.getInt("likes")
        );
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}