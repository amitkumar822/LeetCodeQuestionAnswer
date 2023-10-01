package leetCodeOnline;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses20 {
    static boolean isBalance(String str){
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else{
                if (st.isEmpty()){
                    return false;
                } else if (ch == ')' && st.peek() == '(') {
                    st.pop();
                } else if (ch == '}' && st.peek() == '{') {
                    st.pop();
                } else if (ch == ']' && st.peek() == '[') {
                    st.pop();
                }else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bracket : ");
        String str = sc.nextLine();

        System.out.println("Final Result is here : ");
        System.out.println(isBalance(str));
    }
}
