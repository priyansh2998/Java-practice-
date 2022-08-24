package function;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number ");
        int a = in.nextInt();
        boolean ans = prime_num(a);
        System.out.println(ans);
    }

    static boolean prime_num(int a){
        if(a<=1){
            return false;
        }
        int c=2;
        while(c*c<=a){
            if(a%c==0){
                return false;
            }c++;
        }
        return c*c>a;
    }
}
