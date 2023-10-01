package leetCodeOnline;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public static String ComPre(String[] str){
//        Arrays.sort(str);
        String left = str[0];
        String right = str[str.length-1];
        int idx =0;

        while (idx<left.length() && idx<right.length()){
            if (left.charAt(idx) == right.charAt(idx)){
                idx++;
            }else {
                break;
            }
        }
        return left.substring(0,idx);
    }
    public static void main(String[] args) {

        String[] str = {"flower", "flow", "flight"};
        System.out.println("Final Result : ");
        System.out.println(ComPre(str));
    }
}
