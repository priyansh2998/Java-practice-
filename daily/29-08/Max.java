package function;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the last index of array");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the "+n+" elements to the array");
        for(int a=0;a<n;a++){
            arr[a]=in.nextInt();
        }

        max(arr , n);
    }

    static void max(int[] arr,int n){
        int maximum=arr[0];
        for(int a=1;a<n;a++){
            if(maximum<arr[a]){
                maximum=arr[a];
            }
        }
        System.out.println(maximum+" is the maximum");
    }
}
