package recursion;

import java.util.Scanner;

public class sum_digits {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        System.out.println(sum(a));
    }
    static int sum(int a){
        int i=a%10;
        int j=a/10;
        if(j>0){
            int add=i+sum(j);
            return add;
        }
        else{
            return i;
        }
    }
}
