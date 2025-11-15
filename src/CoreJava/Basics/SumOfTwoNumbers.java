package CoreJava.Basics;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static int Add(int num1, int num2){
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(Add(num1,num2));
    }
}
