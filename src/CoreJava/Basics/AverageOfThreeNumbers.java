package CoreJava.Basics;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int average(int sum) {

        return sum / 3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int sum = sum(num1, num2, num3);

        System.out.println("The average is " + average(sum));

    }
}
