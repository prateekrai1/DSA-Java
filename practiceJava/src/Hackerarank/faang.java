package Hackerarank;

public class faang {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,15,16,18,78,89};
        int target = 17;
    }

    static int cienlingNumber(int[] arr, int tgt){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int m = start+end/2;
            if(tgt>arr[m]){
                start = m+1;

            }
//            else{
//                return null;
//            }
        }
        return 0;
    }
}
