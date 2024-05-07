package LeetcodeEasy;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(2147483647);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int x) {
        int ans = (int)palindrome(x);
        return ans == x;
    }
    static int palindrome(int num){
        while(num > 0) {
            double number = numberOfDigits(num, 0);
            int rem = num % 10;
            int by = num / 10;
            return (int) (rem * Math.pow(10, number - 1) + palindrome(num / 10));
        }
        return 0;
    }
    static int numberOfDigits(int x, int count){
        if(x == 0){
            return count;
        }
        return numberOfDigits(x/10,count+1);
    }
}
