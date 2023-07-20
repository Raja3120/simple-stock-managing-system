import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class NewPage extends JFrame
{
    NewPage(String username)
    {
        JButton btn1 = new JButton("Explore");
        btn1.setBounds(150,215,90,30);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Grid1 grid1 = new Grid1(username);
            }
        });
        add(btn1);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setSize(500, 500);
        setLocationRelativeTo(null);
    }
}
