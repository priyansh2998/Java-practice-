package function;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a 3 digit number ");
        int arm = in.nextInt();
        armstrong(arm);
    }
    static void armstrong(int c){
        int a=c;
        int b=0;
        int d=0;
        for(int i=1; i<=3; i++){
            b=a%10;
            d=d+b*b*b;;
            a=a/10;
        }
        if(d==c){
            System.out.println("number is an Armstrong number");
        }else{
            System.out.println("number is not Armstrong number");
        }
    }
}
