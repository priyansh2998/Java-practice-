package dsa;

import java.util.Scanner;

public class linear_search_2D {
    public static void main(String[] args) {
        int[][] arr={
                {23,89,43,78},
                {47,32,12,34},
                {4,6,7,9}
        };
        System.out.println("enter the target u want to find");
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[][] arr,int a){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==a){
                    return a;
                }
            }
        }
        return -1;
    }
}
