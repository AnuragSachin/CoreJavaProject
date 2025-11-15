package CoreJava.Basics;

import java.util.Scanner;

public class EvenOddCheck {

    public static boolean checkEvenOdd(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {

            if (checkEvenOdd(num)) {
                System.out.println("The number is EVEN");
            } else {
                System.out.println("The number is ODD");
            }

            System.out.println("----------------------------------");
            System.out.print("Enter another number OR press 0 to cancel: ");

            num = sc.nextInt();  // this will be checked in next loop
        }

        System.out.println("Program terminated.");
    }
}
