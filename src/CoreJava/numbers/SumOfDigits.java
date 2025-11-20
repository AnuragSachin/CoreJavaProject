package CoreJava.numbers;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
    }
        System.out.println("The sum of digits in " + num + " is: " + sum);
        input.close();
    }
}
