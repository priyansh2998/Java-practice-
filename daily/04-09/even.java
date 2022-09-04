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
        System.out.println("even number of digits are "+ even_num(arr));
    }
    static int even_num(int[] arr) {
        int a=0;
        for(int i=0;i<5;i++){
            int n=arr[i];
            int count=0;
            while(n>0){
                n=n/10;
                count++;
                }
            if(count%2==0){
                a++;
            }
        }
        return a;
    }
}
