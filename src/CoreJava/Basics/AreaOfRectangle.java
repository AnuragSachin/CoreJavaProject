package CoreJava.Basics;

import java.util.Scanner;

public class AreaOfRectangle {

    public static int areaOfRectangle(int length,int width){
        int area = 1;
        area = length * width;
        return area;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the Rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the width of the Rectangle: ");
        int width = sc.nextInt();

        System.out.println("The area of the rectangle is "+areaOfRectangle(length,width));
    }
}
