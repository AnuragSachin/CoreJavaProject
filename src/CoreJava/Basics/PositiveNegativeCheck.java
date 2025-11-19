package CoreJava.Basics;

import java.util.Scanner;

public class PositiveNegativeCheck {

    public static String checkNumber(int number) {

        if (number > 0) return "Positive";
        if (number < 0) return "Negative";
        return "Zero";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The number is: " + checkNumber(num));
    }
}
