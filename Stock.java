import java.sql.*;
import javax.swing.*;
public class Stock {

    public void Stocks(String user,String stock,double price){
    try
    {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project", "root", "rajan");
        PreparedStatement statement = conn.prepareStatement("INSERT INTO information (username,name, price) VALUES (?, ?, ?)");
        statement.setString(1, user);
        statement.setString(2, stock);
        statement.setDouble(3, price);
        statement.executeUpdate();
        statement.close();
        JOptionPane.showMessageDialog(null,"Stock added to "+user);
    }catch(SQLException e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Stock Not added ");
    }
}
}
