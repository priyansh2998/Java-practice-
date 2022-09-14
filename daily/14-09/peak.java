package dsa;

public class peak {
    public static void main(String[] args) {
        int[] arr={0,2,1,0};
        System.out.println("the peak number is "+mountainum(arr));
    }
    static int mountainum(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }if(arr[mid]>arr[mid+1]){
                end=mid;
            }
        }return arr[start];
    }
}
