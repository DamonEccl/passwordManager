import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class backEnd {

    public static void getData(){
        File file = new File("src/data/data.text");

        try {
            Scanner scanner = new Scanner(file);

                try{
                String firstLine = "";
                firstLine = scanner.nextLine();
                }
                catch (NoSuchElementException e){
                
                freshStart();
                
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

    public static void freshStart(){
        String newPassword;

        Scanner password = new Scanner(System.in);

        System.out.println("Please enter your new password: ");
        newPassword = password.nextLine();

        while (newPassword.length() < 8){
        System.out.println("Password needs to be more than 8 characters");
        System.out.println("Please enter your new password: ");
        newPassword = password.nextLine();
        }

        password.close();

    }


    public static void main(String[] args){
        getData();
    }
}
