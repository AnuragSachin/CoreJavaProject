// Simple Calculator (Sub, Prod, Quotient, Reminder)
// use seperate seperate method for all 

package CoreJava.Basics;

import java.util.Scanner;

public class SimpleCalculator {
  public static int add(int num1, int num2) {
    return num1 + num2;
  }

  public static int sub(int num1, int num2) {
    return num1 - num2;
  }

  public static int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public static int quotient(int num1, int num2) {
    return num1 / num2;
  }

  public static int remainder(int num1, int num2) {
    return num1 % num2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.println(" options");
    System.out.println(" 1 for Addition");
    System.out.println(" 2 for Subtraction");
    System.out.println(" 3 for Multiplication");
    System.out.println(" 4 for Quotient");
    System.out.println(" 5 for Remainder");
    int choice = sc.nextInt();

    switch (choice) {
      case 1:
        System.out.println("Addition: " + add(num1, num2));
        break;
      case 2:
        System.out.println("Subtraction: " + sub(num1, num2));
        break;
      case 3:
        System.out.println("Multiplication: " + multiply(num1, num2));
        break;
      case 4:
        System.out.println("Quotient: " + quotient(num1, num2));
        break;
      case 5:
        System.out.println("Remainder: " + remainder(num1, num2));
        break;
      default:
        System.out.println("Invalid choice");
    }

  }
}
