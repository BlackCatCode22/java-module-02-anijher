//ReversedStrings.Java
import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        String reversed = "";

        //Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        //Ask the user to input a string
        System.out.print("\n\n Please enter a string: \n\n");
        String userInput = scanner.nextLine();

        //Reverse string method
        String reversedString = new StringBuilder(userInput).reverse().toString();

        //Display reversed string
        System.out.println("\n Reversed string: " + reversedString);

    }
}