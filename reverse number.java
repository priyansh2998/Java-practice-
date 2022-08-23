package condition;

import java.util.Scanner;

public class rev_number {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number ");
        long a = in.nextLong();
        long rev_num=0;
        while(a>0)
        {
            long rem=a%10;
            rev_num=rev_num*10+rem;
            a=a/10;
        }
        System.out.println(rev_num);
    }
}
