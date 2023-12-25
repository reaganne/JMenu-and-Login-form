import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuSample extends JFrame{
    public final int WIDTH = 650;
    public final int HEIGHT = 400;
    public Color paint = Color.CYAN;

    public MenuSample()
    {
        setSize(WIDTH, HEIGHT); 
        setTitle("CSC 364E (LAB 1a): Menus, Icons, TextArea");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(paint);

        JTextArea text = new JTextArea();
        text.setEditable(false);
        text.setVisible(true);

        panel.add(text);

        JMenuBar mainmenu = new JMenuBar();
        setJMenuBar(mainmenu);

        JMenu courses = new JMenu("CS CORE COURSES");

        JMenu options = new JMenu("CS Options");

        JMenuItem network = new JMenuItem("Network And Security");
        network.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                text.setText("A network and security course provides comprehensive knowledge of designing,\n implementing, and managing secure computer networks.\n Participants learn to safeguard data, prevent unauthorized access, and counter cyber threats.\n Topics include network architecture, encryption protocols,\n firewalls, intrusion detection systems, and incident response. \nPractical skills in configuring and maintaining secure networks are emphasized, \npreparing individuals for roles in cybersecurity, \nnetwork administration, and information technology. \n The course equips students with the tools to address evolving cyber threats and fortify organizational defenses,\n ensuring a robust and resilient digital infrastructure.\n");
                text.setBackground(paint);
            }
        });

        JMenuItem software = new JMenuItem("Software Development");
        software.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                text.setText("    A software development course immerses participants in the end-to-end    \n process of creating, testing, and deploying software applications.     \nCovering programming languages, development methodologies, and tools,      \nthe course emphasizes problem-solving and coding skills.    \n Students gain expertise in software design, debugging, and version control, fostering the ability to create scalable and efficient solutions.    \nTopics often include algorithmic thinking, database management, and web development.       \n Practical projects enhance real-world application, preparing individuals for roles in software engineering.      \n The course cultivates a deep understanding of coding principles and best practices,     \n empowering developers to contribute effectively to diverse software projects.");
                text.setBackground(paint);
            }
        });

        JMenuItem computer = new JMenuItem("Computer Engineering");
        computer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                text.setText("A computer engineering course delves into the intersection of electrical engineering and computer science, \nequipping students with the skills to design, develop, and maintain computer systems and hardware.\n Topics encompass digital circuit design, microprocessor architecture, embedded systems, and computer networks. \nStudents gain proficiency in programming languages, hardware description languages, and system integration.\n Practical projects often involve building and optimizing computer components.");
                text.setBackground(paint);
            }
        });

        options.add(network);
        options.add(software);
        options.add(computer);

        mainmenu.add(courses);
        mainmenu.add(options);

        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,2));

       JButton button = new JButton();
      button.setText("");

      ImageIcon icon = new ImageIcon(getClass().getResource("exit-icon-4623 (1).jpg"));
        

      button.setIcon(icon);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        JButton button2 = new JButton();
        button2.setText("TOGGLR BACKGROUND COLOR");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                paint = (paint == Color.CYAN)? Color.WHITE : Color.CYAN;
                panel.setBackground(paint);
                text.setBackground(paint);
            }
        });
        panel2.add(button);
        panel2.add(button2);

        add(panel);
        add(panel2, BorderLayout.SOUTH);




        setVisible(true);

    }
    public static void main(String[] args) {
        
        new MenuSample();
    }
}
