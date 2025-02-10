//LargestOfThree.java

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        //Scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        //Determine the largest integer using nested if statement
        int largest;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }
        //Output the largest integer
        System.out.println("The largest integer is: " + largest);
    }
}
