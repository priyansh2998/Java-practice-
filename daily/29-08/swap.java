package function;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of index to add in an array");
        int k=in.nextInt();
        int[] arr= new int[k];
        System.out.println("enter the array");
        for(int x=0;x<k;x++){
            arr[x]=in.nextInt();
        }
        System.out.println("enter the index you want to swap");
        int i=in.nextInt();
        int j=in.nextInt();
        swap(arr,i,j);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int a,int b){
        int temp=0;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
