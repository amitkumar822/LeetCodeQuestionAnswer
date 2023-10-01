package leetCodeOnline;

public class PalindromeNumber9 {
    static boolean isPalindrome(int num){
        String str=String.valueOf(num);
        int len=str.length();
        for (int i=0; i<len; i++){
            if (str.charAt(i) != str.charAt(len-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num=121;
        if (isPalindrome(num)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
