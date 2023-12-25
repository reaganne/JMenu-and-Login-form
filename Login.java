import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{

    public final int WIDTH = 400;
    public final int HEIGHT = 150;
    private JTextField nametext;
    private JPasswordField passtext;

    public Login()
    {
        setSize(WIDTH, HEIGHT);
        setTitle("CSC 364E Account Login");
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        panel.setVisible(true);

        JLabel namelabel = new JLabel("User Name: ");
        JLabel password = new JLabel("Password: ");

        nametext = new JTextField(20);
        passtext = new JPasswordField(20);

        JButton login = new JButton();
        login.setText("Login");
        login.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                details();
            }
        });


        panel.add(namelabel);
        panel.add(nametext);
        panel.add(password);
        panel.add(passtext);
        panel.add(login);

        add(panel);

        
        setVisible(true);
    }
    private void details()
        {
            String username = nametext.getText();
            String password = new String(passtext.getPassword());

           try( BufferedWriter player = new BufferedWriter(new FileWriter("login.txt", true)))
            {
                player.write("User Name: "+ username + "\nPassword :" + password +"\n\n");
                player.flush();
                JOptionPane.showMessageDialog(this, "Deatails saved successfuly.");

            }
           catch(IOException e)
           {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred when saving your detalis...");
           }

           nametext.setText("");
           passtext.setText("");

        }

    public static void main(String[] args) {
        
        new Login();
    }
    
}
