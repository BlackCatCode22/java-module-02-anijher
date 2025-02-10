//MaddnessWithMethods.java
import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getAnIntFromTheUser
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        //compare two integers
        if (num1 > num2) {
            System.out.println("\n num1 + 'is greater than' + num2");
        } else if (num1 < num2) {
            System.out.println("\n num1 + 'is less than' + num2");

    }
        //sum of two integers
        int sum = sumTwoInts(num1, num2);
        System.out.println("The sum of two integers is: " + sum);
}
//function to sum integers
    public static int sumTwoInts(int num1, int num2) {
        return num1 + num2;
    }
}





