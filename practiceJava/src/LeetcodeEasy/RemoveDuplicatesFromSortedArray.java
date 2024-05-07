//package LeetcodeEasy;
//
//
//import java.util.ArrayList;
//
////Remove Duplicates from sorted array
//public class RemoveDuplicatesFromSortedArray {
//    public static void main(String[] args) {
//        int[]nums = {1,2,3,4,4,5};
//        ArrayList<Integer> ans = removeDuplicates(new ArrayList<>(nums.length),nums,0,0);
//        System.out.println(ans);
//        for(int i=ans.size();i<nums.length;i++){
//            ans.add("_");
//        }
//        System.out.println(ans);
//    }
//
//    static ArrayList<Integer> removeDuplicates(ArrayList <String> processed, int[] nums, int unique, int index) {
//        if(index >= nums.length){
//            return processed;
//        }
//        if(!processed.contains(nums[index])){
//            processed.add(nums[index]);
//        }
//        removeDuplicates(processed,nums,processed.size(),index+1);
//        return processed;
//    }
//}
