package CoreJava.Basics;

import java.util.Scanner;

public class CharacterTypeCheck {

    // Method to check character type
    public static String checkCharacter(char ch) {

        if (ch >= '0' && ch <= '9') {          // digit range
            return "Digit";

        } else if (ch >= 'A' && ch <= 'Z') {  // uppercase alphabet range
            return "Uppercase Alphabet";

        } else if (ch >= 'a' && ch <= 'z') {  // lowercase alphabet range
            return "Lowercase Alphabet";

        } else {
            return "Special Character";       // everything else
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        String result = checkCharacter(ch);

        System.out.println("Character Type: " + result);
    }
}
