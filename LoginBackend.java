import java.sql.*;
public class LoginBackend {

    public static boolean authenticateUser(String user, String pass) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project",  "root","rajan" );

            PreparedStatement statement = conn.prepareStatement("SELECT * FROM login_page WHERE Username = ? AND password = ?");
            statement.setString(1, user);
            statement.setString(2, pass);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                conn.close();
                return true;
            } else {
                conn.close();
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
