package condition;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = in.nextInt();
        for(int j=0;j<=n;j++)
        {
            int temp=b;   // storing b's valur in temporary integer
            b=a+b;
            a=temp;
        }
        System.out.println("the fibonacci series answer is " + b);
    }
}
