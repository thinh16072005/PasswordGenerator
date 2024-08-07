import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher extends Criteria {
    public static void main(String[] args) {
        System.out.println("Welcome to the Password Generator!");
        System.out.print("Enter the length of password (at least 8 characters): ");
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        // Initialize objects
        Criteria cr = new Criteria();
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        // Check if the length is at least 8 characters:
        while (true) {
            if (length < 8) {
                System.out.print("The password length must be at least 8 characters. Please enter a valid length: ");
                length = sc.nextInt();
            } else {
                break;
            }
        }
        
        // Criteria for the password based on user's choice:
        System.out.println("Choose the following criteria for your password (1 for YES, 0 for NO):");
            
        System.out.println("Does the password contain uppercase letters? ");
        upperCaseChoice = sc.nextInt();
        cr.setIncludeUpperCase(upperCaseChoice);

        System.out.println("Does the password contain lowercase letters? ");
        lowerCaseChoice = sc.nextInt();
        cr.setIncludeLowerCase(lowerCaseChoice);

        System.out.println("Does the password contain numbers? ");
        numbersChoice = sc.nextInt();
        cr.setIncludeNumbers(numbersChoice);

        System.out.println("Does the password contain special symbols? ");
        symbolsChoice = sc.nextInt();
        cr.setIncludeSymbols(symbolsChoice);

        // Output and Error handling:
        try {
            System.out.println(passwordGenerator.generatePassword(
                length,
                cr.isIncludeUpperCase(),
                cr.isIncludeLowerCase(),
                cr.isIncludeNumbers(), 
                cr.isIncludeSymbols()
        ));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {System.out.println("Your password has been generated!");}
        sc.close();   
    }
}