import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("Welcome to the Password Generator!");
        System.out.println("Enter the length of password:");
        Scanner sc = new Scanner(System.in);
        // Error handling:
        try {
            int length = sc.nextInt();
        } catch (Exception e) {
            System.err.println("Please enter a number!");
        }
    }
}
