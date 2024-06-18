import javax.swing.*;


public class App {
    public static JFrame frame = new JFrame();
    public static JPanel panel = new JPanel();
    public static JButton b, b1, b2;
    public static JPasswordField passwordField = new JPasswordField();
    

   

    public static void GUI() {
        b = new JButton("Set");
       
        panel.add(passwordField); 
        panel.add(b);
        
        frame.add(panel);
        frame.setSize(1000, 1000);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setVisible(true);
    }


        
}
