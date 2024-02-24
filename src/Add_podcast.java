import java.sql.*;

public class Add_podcast { // Adding song to library

  public void add_podcast( String title, String author, String playlist, String duration, String type, int likes) {
    String command = "INSERT INTO Podcasts (title, author, playlist, duration, type, likes) VALUES (?, ?, ?, ?, ?, ?)";

    try (
      Connection conn = sql_connect.connect();
      PreparedStatement prepstmt = conn.prepareStatement(command)) {
      prepstmt.setString(1, title);
      prepstmt.setString(2, author);
      prepstmt.setString(3, playlist);
      prepstmt.setString(4, duration);
      prepstmt.setString(5, type);
      prepstmt.setInt(6, likes);


      prepstmt.executeUpdate();
      System.out.println("Adding podcast to liked");
      System.out.println("Added to liked!");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}