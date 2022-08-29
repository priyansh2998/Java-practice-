package function;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the last index of array");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the "+n+" elements to the array");
        for(int a=0;a<n;a++){
            arr[a]=in.nextInt();
        }
        rev(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr,int n){
        int x=0;
        for (int a=0;a<n/2;a++){
            x=arr[a];
            int k=n-a-1;
            arr[a]=arr[k];
            arr[k]=x;
        }
    }
}
