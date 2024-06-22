import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.*;


public class App {
    public static JFrame frame = new JFrame();
    public static JPanel northP = new JPanel(new FlowLayout());
    public static JPanel southP = new JPanel(new GridLayout(2, 2));
    public static JPanel eastP = new JPanel(new GridLayout(2, 2));
    public static JPanel westP = new JPanel(new GridLayout(2, 2)); 
    public static JPanel panel = new JPanel(new FlowLayout());
    
    
    public static JButton b, b1, b2;
    public static JPasswordField passwordField = new JPasswordField();
    public static JLabel createText;
    

   

    public static void GUI() {
        
        frame.setLayout(new BorderLayout());

        createText = new JLabel("Enter a new Password");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);


        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(createText, gbc);

        b = new JButton("Create");
        b.setPreferredSize(new Dimension(75, 25));
        passwordField.setPreferredSize(new Dimension(175, 25)); 

        
         
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(passwordField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(b, gbc);



        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String ello = "Ollo";

                backEnd.freshStart(ello);
            }
        });
        
        frame.add(northP, BorderLayout.NORTH);
        frame.add(southP, BorderLayout.SOUTH);
        frame.add(eastP, BorderLayout.EAST);
        frame.add(westP, BorderLayout.WEST);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(1000, 1000);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setVisible(true);
    }


        
}
