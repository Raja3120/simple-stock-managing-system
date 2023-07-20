import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StockSelling {
   StockSelling(String Username){
        JFrame f = new JFrame("Selling");
        Toolkit tk = Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
        Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
        f.setSize(screenSize.width,screenSize.height);
        JPanel p = new JPanel();
        JLabel m = new JLabel("STOCK SELLING ");

        m.setBounds(10,10,200,100);

        m.setForeground(Color.white);
        m.setFont(new Font("serif",40,40));
        p.add(m);
        JButton b1 = new JButton("CLICK HERE");
        JLabel l = new JLabel("To Sell your stocks");
        l.setBounds(230,100,190,20);
        b1.setBounds(90,100,120,20);
        b1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                new Stock1(Username);
             }
        });
        p.setBounds(0,0,screenSize.width,80);
        p.setBackground(Color.black);
        f.add(p);
        f.add(l);
        f.add(b1);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

}