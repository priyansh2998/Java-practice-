package recursion;

import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        System.out.println(rev(a));
    }
    static int rev(int a){
        int count=(int)(Math.log10(a)+1);
        return helper(a,count);
    }
    private static int helper(int a , int count){
        if(count==0){
            return a;
        }
        return a%10*(int)Math.pow(10,count-1)+helper(a/10,count-1);
    }
}
