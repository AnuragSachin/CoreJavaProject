package CoreJava.Basics;

import java.util.Scanner;

public class DecisionCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, nextInput;
        char op;

        System.out.print("Enter the first number (0 to exit): ");
        nextInput = sc.nextInt();

        while (nextInput != 0) {

            num1 = nextInput;

            System.out.print("Enter the second number: ");
            num2 = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /, %): ");
            op = sc.next().charAt(0);

            System.out.println("----------------------------------");

            if (op == '+') {
                System.out.println("Result = " + (num1 + num2));
            } else if (op == '-') {
                System.out.println("Result = " + (num1 - num2));
            } else if (op == '*') {
                System.out.println("Result = " + (num1 * num2));
            } else if (op == '/') {
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Error: Division by ZERO not allowed!");
            } else if (op == '%') {
                if (num2 != 0)
                    System.out.println("Result = " + (num1 % num2));
                else
                    System.out.println("Error: Modulus by ZERO not allowed!");
            } else {
                System.out.println("Invalid operator!");
            }

            System.out.println("----------------------------------");
            System.out.print("Enter another number OR press 0 to exit: ");
            nextInput = sc.nextInt();
        }

        System.out.println("Program terminated.");
    }
}
