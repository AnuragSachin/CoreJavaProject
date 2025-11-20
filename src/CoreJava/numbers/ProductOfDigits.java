package CoreJava.numbers;

import java.util.Scanner;

public class ProductOfDigits {
    public static int productOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num < 0) {
            num = -num;
        }
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num = num / 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int product = productOfDigits(num);
        System.out.println("The product of digits in " + num + " is: " + product);
    }
}
