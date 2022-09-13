package dsa;

import java.util.Arrays;

public class first_last_position {
    public static void main(String[] args) {
        int[] nums={2,3,4,4,6,6,6,6,8,9,9,9};
        int target = 6;
        int[] ans={-1,-1};
        ans[0]=change_num(nums , target ,true);
        ans[1]=change_num(nums , target ,false);

        System.out.println(Arrays.toString(ans));
    }
    static int change_num(int[] arr,int a,boolean i){
        int ans=-1;
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a<arr[mid]){
                end=mid-1;
            }else if(a>arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(i){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
