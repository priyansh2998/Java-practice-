package dsa;

public class peak {
    public static void main(String[] args) {
        int[] arr={1,2,4,8,11,99,9,8,3};
        System.out.println("the peak number is "+mountainum(arr));
    }
    static int mountainum(int[] arr){
        int mid=0;
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }
        }return arr[mid];
    }
}
