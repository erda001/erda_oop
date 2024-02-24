import java.sql.*;

public class Update_podcast { //Updating songs in library by it's ID;

  public void update_podcast(int id, String title, String author, String playlist, String type, int likes) {
    String command = "UPDATE Podcasts SET title = ?, author = ?, playlist = ?, type = ?, likes = ? WHERE id = ?";

    try (
      Connection conn = sql_connect.connect();
      PreparedStatement prepstmt = conn.prepareStatement(command)
    ) {
      prepstmt.setString(1, title);
      prepstmt.setString(2, author);
      prepstmt.setString(3, playlist);
      prepstmt.setString(4, type);
      prepstmt.setInt(5, likes);
      prepstmt.setInt(6, id);

      int affectedRows = prepstmt.executeUpdate();
      if (affectedRows > 0) { 
        System.out.println("Podcast info successfully updated");
      } 
      else {
        System.out.println("PodcastID " + id + " not found");
      }
    } 
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}