import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,12,23,39};
        Scanner in= new Scanner(System.in);
        System.out.println("enter the target integer ");
        int target = in.nextInt();
        System.out.println("the ceiling integer is "+ ceiling_num2(arr,target));
    }
    static int ceiling_num2(int[] arr, int a){
        if(a>arr.length-1) {
            return -1;                //if target is our of range
        }
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (a<arr[mid]){
                end=mid-1;
            } else if (a>arr[mid]) {
                start=mid+1;
            } else if (a==arr[mid]) {
                return arr[mid];
            }
        }return arr[start];
    }
//    static int ceiling_num(int[] arr,int a){
//        for(int i=0;i<arr.length;i++){
//            if(a>arr[i]&&a<=arr[i+1]){
//                return arr[i+1];
//            }
//        }
//        return -1;
//    }
}
