import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome to the Password Generator!");
        System.out.print("Enter the length of password (at least 8 characters): ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        // Initialize objects
        Criteria cr = new Criteria();
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        // Output and Error handling:
        try {
            System.out.println("Choose the following criteria for your password (1 for YES, 0 for NO):");
            System.out.println("Does the password contain uppercase letters? "); 
            System.out.println("Does the password contain lowercase letters? ");
            System.out.println("Does the password contain numbers? ");
            System.out.println("Does the password contain special symbols? ");
            System.out.println(passwordGenerator.generatePassword(
                length,
                cr.isIncludeUpperCase(),
                cr.isIncludeLowerCase(),
                cr.isIncludeNumbers(), 
                cr.isIncludeSymbols()
        ));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {System.out.println("The password has been generated!");}
        sc.close();   
    }
}
