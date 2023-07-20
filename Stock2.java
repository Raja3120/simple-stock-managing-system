import java.sql.*;
import javax.swing.*;
public class Stock2 {
    int i=0;
    Stock2(String Username){
        JFrame f = new JFrame();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project", "root", "rajan");
            PreparedStatement statement = conn.prepareStatement("select * from information where username=?");
            statement.setString(1, Username);
            ResultSet rs= statement.executeQuery();
            while(rs.next()&&i<1000){
                String stock=rs.getString("name");
                double price=rs.getDouble("price");
                String price1=String.valueOf(price);
                JLabel l =new JLabel(stock);
                JLabel l1 =new JLabel(price1);
                JButton b =new JButton("Menu");
                l.setBounds(50,10+i,105,30);
                l1.setBounds(300,10+i,105,30);
                f.add(l);
                f.add(l1);
                f.add(b);
                b.setVisible(false);
                f.setSize(500,500);
                f.setVisible(true);
                i +=30;
              //  System.out.println(stock+price);
            }
            statement.close();
        }catch(SQLException e){
            e.printStackTrace();

        }
    }

}
