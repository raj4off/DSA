public class RecursionStringPalindrome {
    public static void main(String[] args) {
        String s = "racecara";
        System.out.print(checkPalindrome(s, 0));
    }

    public static boolean checkPalindrome(String s, int i){
        if(i >= s.length()/2) return true;
        return (s.charAt(i) == s.charAt(s.length()-i-1)) ? checkPalindrome(s, i+1) : false;
    }
}
