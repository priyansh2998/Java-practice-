package dsa;

public class alphabets_ceiling {
    public static void main(String[] args) {
        char[] letter={'c','f','j'};
        char target='a';
        System.out.println("the ceiling for " +target+" is "+ceilng(letter,target));
    }
    static char ceilng(char[] letter,char target){
        int start=0;int end=letter.length-1;
        if(target<=letter[start]){
            return 'j';
        }
        else if(target>=letter[end]){
            return 'c';
        }
        while(start>=end){
            int mid=(start+end)/2;
            if (target < letter[mid]) {
                end=mid-1;
            }else if(target > letter[mid]){
                start=mid+1;
            }
        }return letter[start];
    }
}
