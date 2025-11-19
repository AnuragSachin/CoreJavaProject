package CoreJava.Basics;

import java.util.Scanner;

public class DaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static int getDays(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            return 31;
        }else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }else if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number! Please enter between 1 and 12.");
            return;
        }

        int year = 0;
        if (month == 2) {
            System.out.print("Enter year: ");
            year = sc.nextInt();
        }

        int days = getDays(month, year);

        System.out.println("Number of days = " + days);
    }
}
