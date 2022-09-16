package dsa;

public class rotatation_count {
    public static void main(String[] args) {
        int[] arr={2,5,7,8,9,11,0};
        System.out.println("array is rotated "+rotated(arr)+" times");
    }
    static int rotated(int[] arr){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return -1;
    }
}
