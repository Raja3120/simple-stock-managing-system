import java.sql.*;
import javax.swing.*;
public class Stock1{
    public Stock1(String Username) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project", "root", "rajan");
            PreparedStatement statement = conn.prepareStatement("delete from information where username=?");
            statement.setString(1, Username);
            statement.executeUpdate();
            statement.close();
            JOptionPane.showMessageDialog(null,"Stock Sell from "+Username);

        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Stock Not Sell");
        }

    }
}

