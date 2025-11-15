package CoreJava.Array2d;

import java.util.Arrays;

public class SumOfPrimaryDiagonal {
    public static void main(String args[]) {
        int arr[][] = new int[5][5];
        int v = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = v++;
            }
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        // For Sum
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j)
                    sum += arr[i][j];
            }
        }
        System.out.println("Sum of Primary Diagonal is : " + sum);
    }
}
