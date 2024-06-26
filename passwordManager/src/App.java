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
    public static JLabel createText, incorrect;
    

   

    public static void GUI() {
        
        frame.setLayout(new BorderLayout());
        
        panel.setBackground(Color.WHITE);
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
        gbc.gridheight = 6;
        //gbc.anchor = GridBagConstraints.CENTER;
        panel.add(passwordField, BorderLayout.CENTER);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        gbc.gridheight = 6;
        //gbc.anchor = GridBagConstraints.CENTER;
        panel.add(b, BorderLayout.CENTER);



        
        b.addActionListener(new ActionListener() {
            int duplicateClick = 0;
            public void actionPerformed(ActionEvent e){
                String ello = String.valueOf(passwordField.getPassword());

                if (ello.length() < 8 && duplicateClick == 0){
                    incorrect = new JLabel("Password does not contain atleast 8 characters");
                    incorrect.setBackground(Color.RED);
                    gbc.gridx = 0;
                    gbc.gridy = 5;
                    gbc.gridheight = 6;
                    panel.add(incorrect, gbc);
                    frame.setVisible(true);
                    duplicateClick += 1;
                }
                else if (ello.length() < 8 && duplicateClick >= 1){

                }
                else{
                backEnd.freshStart(ello);
                }

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
