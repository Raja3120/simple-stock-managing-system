import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class LoginForm extends JFrame implements ActionListener
{
    JButton b1;
    JPanel newPanel;
    JLabel username;
    JLabel password;
    final JTextField textField1,textField2;
    LoginForm()
    {
        username = new JLabel();
        username.setText("Username");
        textField1 = new JTextField(15);
        password = new JLabel();
        password.setText("Password");
        textField2 = new JPasswordField(15);
        b1=new JButton("Login");
        newPanel =  new JPanel(new GridLayout(3,1));
        newPanel.add(username);
        newPanel.add(textField1);
        newPanel.add(password);
        newPanel.add(textField2);
        newPanel.add(b1);
        newPanel.setSize(500,200);
        add(newPanel,BorderLayout.CENTER);
        b1.addActionListener(this);
        setTitle("LOGIN PAGE");
    }
    public void actionPerformed(ActionEvent ae)
    {
        String userValue = textField1.getText();
        String passValue = textField2.getText();
        boolean isAuthenticated = LoginBackend.authenticateUser(userValue, passValue);
        if (isAuthenticated) {
           NewPage page = new NewPage(userValue);

            JLabel wel_label = new JLabel("Welcome: "+userValue);
            page.getContentPane().add(wel_label);
            page.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid username and password" , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

public class Loginpage
{
    public static void main(String[] arg)
    {
        try
        {
            LoginForm form = new LoginForm();
            form.setSize(350,200);
            form.setLocationRelativeTo(null);
            form.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}