package LeetcodeEasy;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
    static boolean isValid(String s){
        boolean isvalid = true;
        if(s.isEmpty()){
            return false;
        }
        for(int i=0; i<s.length()-1; i++) {
            if (!(s.charAt(i) == '(') && (s.charAt(i + 1) == ')')) {
                return false;
            } else {
                if (!(s.charAt(i) == '[') && (s.charAt(i + 1) == ']')) {
                    return false;
                } else {
                    if (!(s.charAt(i) == '{') && (s.charAt(i + 1) == '}')) {
                       return false;
                    }
                }
            }
        }
        return isvalid;
    }
}
