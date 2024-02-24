import java.sql.*;

public class Remove_podcast {

  public void remove_podcast(String title) {
    String command = "DELETE FROM Podcasts WHERE title = ?";

    try (
      Connection conn = sql_connect.connect();
      PreparedStatement prepstmt = conn.prepareStatement(command)) {
      prepstmt.setString(1, title);

      int affectedRows = prepstmt.executeUpdate();
      if (affectedRows > 0) {
        System.out.println("Podcast \"" + title + "\" successfully removed");
      } 
      else {
        System.out.println("No podcast \"" + title + "\" found :(");
      }
    } 
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
  }
}
