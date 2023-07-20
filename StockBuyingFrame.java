import javax.swing.*;
import java.awt.*;
public class StockBuyingFrame {

        JFrame f;
        StockBuyingFrame(String username){
        f = new JFrame("Buying");
        Toolkit tk = Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
        Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
        f.setSize(screenSize.width,screenSize.height);
        JPanel p = new JPanel();
        JLabel m = new JLabel("STOCK BUYING ");

        m.setBounds(10,10,200,100);

        m.setForeground(Color.white);
        m.setFont(new Font("serif",40,40));
        p.add(m);
        JLabel l = new JLabel("1.TATA");
        JLabel l1 = new JLabel("2.MAHINDRA");
        JLabel l2 = new JLabel("3.RELIANCE");
        JLabel l3 = new JLabel("4.ADANI SHARES");

        JButton b = new JButton("623.35INR");
        JButton b1 = new JButton("1571.05INR");
        JButton b2 = new JButton("2748.00INR");
        JButton b3 = new JButton("2363.00INR");
        l.setBounds(100, 120, 100, 20);
        l1.setBounds(100, 170, 100, 20);
        l2.setBounds(100, 220, 100, 20);
        l3.setBounds(100, 270, 150, 20);
        p.setBounds(0,0,screenSize.width,80);
        p.setBackground(Color.black);

        b.setBounds(250, 120, 100, 20);
        b1.setBounds(250, 170, 100, 20);
        b2.setBounds(250, 220, 100, 20);
        b3.setBounds(250, 270, 100, 20);
        f.add(p);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);


                Stock controller = new Stock();
                b.addActionListener(e -> controller.Stocks(username,"TATA", 623.35));
                b1.addActionListener(e -> controller.Stocks(username,"MAHINDRA", 1571.05));
                b2.addActionListener(e -> controller.Stocks(username,"RELIANCE", 2748.00));
                b3.addActionListener(e -> controller.Stocks(username,"ADANI SHARES", 2363.00));
    }
    }
