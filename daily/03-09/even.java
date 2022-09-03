package dsa;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array of 5 index");
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("even number of digits are "+ even(arr));
    }
    static int even(int[] arr){
        int count=0;
        for(int i=0;i<5;i++){
            if(arr[i]%2==0){
                count+=1;
            }
        }
        return count;
    }
}
