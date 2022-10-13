package recursion;

public class isSorted {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,9,11,23,1,9};
        System.out.println(check(arr));
    }
    static boolean check(int[] arr){
        int a=0;
        return helper(arr,a);
    }
    private static boolean helper(int[] arr,int a){
        if(a==arr.length-1){
            return true;
        }
//        if(arr[a]<arr[a+1]){
//            return helper(arr,a+1);
//        }
//        return false;
        return arr[a]<arr[a+1] && helper(arr,a+1);
    }
}
