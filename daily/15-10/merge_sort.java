package recursion;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args){
        int[] arr={4,99,23,47,12};
        int[] ans=sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int start=0;
        int end=arr.length;
        int mid =arr.length/2;
        int[] arrLeft=sort(Arrays.copyOfRange(arr,start,mid));
        int[] arrRight=sort(Arrays.copyOfRange(arr,mid,end));
        return merge(arrLeft,arrRight);
    }
    static int[] merge(int[] first,int[] second){
        int[] arr=new int[first.length+second.length];
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if (a>=first.length){
                arr[i]=second[b];
                b++;
            } else if (b>=second.length) {
                arr[i]=first[a];
                a++;
            }else if(first[a]<second[b]){
                arr[i]=first[a];
                a++;
            } else if (first[a]>second[b]) {
                arr[i]=second[b];
                b++;
            }
        }
        return arr;
    }
}
