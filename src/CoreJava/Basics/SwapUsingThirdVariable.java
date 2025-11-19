package CoreJava.Basics;

import java.util.Scanner;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int temp = 0;
        // Swapping using third variable
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}