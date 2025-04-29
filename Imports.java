
import java.util.Scanner;         
import java.util.Date;            
import java.text.SimpleDateFormat; 

public class Imports {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        
        Date currentDate = new Date();

        
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM d, yyyy HH:mm:ss");

        
        System.out.println("Hello, " + name + "!");
        System.out.println("Current date and time: " + formatter.format(currentDate));

        input.close();
    }
}
