package dsa;

public class missing_num {
    public static void main(String[] args) {
        int[] arr={0,1};
        System.out.println("the missing number is "+ missing(arr));
    }
    static int missing(int[] arr){
        cyclic(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }return arr.length;
    }
    static void cyclic(int[] arr){
        int i=0;
        int a=arr.length;
        while(i<a){
            if(arr[i]!=i && arr[i]<a){
                int temp=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
    }
}
