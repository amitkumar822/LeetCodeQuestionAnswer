package leetCodeOnline.Strings;

public class BackspaceStringCompare_844 {
    public static boolean backspaceCompare(String s,String t){
        String s1 = backSpaceCount(s);
        String t1 = backSpaceCount(t);
        return s1.equals(t1);
    }
    private static String backSpaceCount(String str){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int len = str.length();
        for (int i=len-1; i>=0; i--){
            if(str.charAt(i) == '#'){
                count++;
            } else if (count != 0) {
                count--;
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        boolean result = backspaceCompare(s,t);
        System.out.println(result);
    }
}

/*
844. Backspace String Compare
Solved
Easy
Topics
Companies
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.



Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".


Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.


Follow up: Can you solve it in O(n) time and O(1) space?
 */