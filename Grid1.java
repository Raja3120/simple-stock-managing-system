import java.awt.*;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.*;
public class Grid1
{
    JFrame frameObj;
    Grid1(String username)
    {
        frameObj = new JFrame("Welcome");
        Toolkit tk = Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
        Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
        frameObj.setSize(screenSize.width,screenSize.height);
        JPanel p = new JPanel();
        JLabel m = new JLabel("STOCK MANAGEMENT MENU ");

        m.setBounds(10,10,200,100);

        m.setForeground(Color.white);
        m.setFont(new Font("serif",40,40));
        p.add(m);

        JButton btn1 = new JButton("Stock Buying");
        JButton btn2 = new JButton("Stock Selling");
        JButton btn3 = new JButton("Menu");
        JButton btn4 = new JButton("Stock Tracing");
        btn1.setBounds(150,150,200,40);

        btn2.setBounds(150,200,200,40);
        btn4.setBounds(150,250,200,40);
        p.setBounds(0,0,screenSize.width,80);
        p.setBackground(Color.black);
        frameObj.add(p);
        frameObj.add(btn1);
        frameObj.add(btn2);
        frameObj.add(btn4);
        frameObj.add(btn3);
       btn3.setVisible(false);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new StockBuyingFrame(username);
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new StockSelling(username);
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Stocktracing(username);
            }
        });
        frameObj.setSize(500, 500);
        frameObj.setLocationRelativeTo(null);
        frameObj.setVisible(true);
    }}
