package leetCodeOnline;

import java.util.Scanner;

public class MergetringsAlternately_Q1768 {

    public static String mergeAlternately(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i=0;

        while(i<len1 || i<len2){
            if (i<len1){
                sb.append(word1.charAt(i));
            }
            if(i<len2){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String marge : ");
        String word1 = sc.nextLine();
        System.out.println("Enter second String marge alternate : ");
        String word2 = sc.nextLine();

        String result = mergeAlternately(word1,word2);
        System.out.println("Final alternate marge  result is here : ");
        System.out.println(result);
    }
}
