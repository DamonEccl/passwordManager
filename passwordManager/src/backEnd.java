import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;


public class backEnd {

    public static void getData(){
        File file = new File("src/data/data.txt");

        try {
            Scanner scanner = new Scanner(file);

                try{
                String firstLine = "";
                firstLine = scanner.nextLine();
                }
                catch (NoSuchElementException e){
                
                
                
                }
            

            scanner.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Thats not good... FILE NOT FOUND");
        } 
        
        
           
    }

    public static void mainPass(){

    }

    public static void search(){

    }

    public static void makePassword(){

    }

    public static void freshStart(String pass){
        String newPassword;

        //Scanner password = new Scanner(System.in);

        //System.out.println("Please enter your new password: ");
        //newPassword = password.nextLine();

        //while (newPassword.length() < 8){
        //System.out.println("Password needs to be more than 8 characters");
        //System.out.println("Please enter your new password: ");
        //newPassword = password.nextLine();
        //}
        String encrypted = Encryption.encode(pass);

        try{
            FileWriter writer = new FileWriter("src/data/data.txt");
            //writer.write(encrypted);
            writer.close();
            System.out.println("Password was saved");
        }
        catch (Exception e){
            System.out.println("Something went wrong with saving");
        }


        System.out.println(encrypted);
        //password.close();
    }

    public static void display(){

    }


    public static void main(String[] args){
        App.GUI();
        getData();
        display();
    }
}
