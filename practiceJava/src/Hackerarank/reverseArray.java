package Hackerarank;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {

    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> reverse = new ArrayList<Integer>();
        for(int i=a.size()-1; i>=0; i--){
            int each = a.get(i);
            reverse.add(each);
        }
        return reverse;
    }
}
