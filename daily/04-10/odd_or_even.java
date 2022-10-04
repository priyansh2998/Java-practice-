package condition;

import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner in = new Scanner(System.in);
        int i= in.nextInt();
        System.out.println("Is it odd "+ odd(i));
    }

    static boolean odd(int a){
        return(a & 1)==1;
    }
}
