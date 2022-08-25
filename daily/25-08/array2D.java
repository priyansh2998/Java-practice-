package function;

import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter an array ");
        int[][] arr = new int[3][2];
        for (int row=0;row < arr.length;row++){
            for(int col=0; col < arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
        for (int row=0;row < arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
//            for(int col=0; col < arr[row].length;col++){
//                System.out.println(arr[row][col]);
//                }
        }
    }
}
