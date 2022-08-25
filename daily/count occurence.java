package condition;

import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the any number ");
        long i = in.nextLong();
        System.out.println("number whose occurrences you want to find");
        int k = in.nextInt();
        long j = 0;
        int count =0;
        while(i>0)
        {
            j=i%10;
            if(j==k)
            {
                count++;;
            }
            i=i/10;
            
        }
        System.out.println(count);

    }
}
