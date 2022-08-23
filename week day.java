package swcase;

import java.util.Scanner;

public class week_name {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of week from 0 to 7");
        int a = in.nextInt();

        switch(a) {
            case 1 -> System.out.println("the day is monday");
            case 2 -> System.out.println("the day is tuesday");
            case 3 -> System.out.println("the day is wednesday");
            case 4 -> System.out.println("the day is thursday");
            case 5 -> System.out.println("the day is friday");
            case 6 -> System.out.println("the day is saturday");
            case 7 -> System.out.println("the day is sunday");
        }
    }
}
