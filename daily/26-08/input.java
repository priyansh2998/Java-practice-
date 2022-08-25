package function;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter 5 string values ");
        String[] str = new String[5];

        for (int i=0; i<str.length; i++){
            str[i]= in.next();
        }

//        for (int i = 0; i<str.length; i++){
//            System.out.print(str[i] + " ");
//        }
        System.out.println(Arrays.toString(str));
    }
}
