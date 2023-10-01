package leetCodeOnline;

import java.util.Scanner;
import java.util.*;

public class RomanToNumber {
    public static int printRomanNum(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = map.get(str.charAt(str.length()-1));
        for (int i= str.length()-2; i>=0; i--){
            if (map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
                result -= map.get(str.charAt(i));
            }else {
                result += map.get(str.charAt(i));
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet : ");
        String str = sc.nextLine();
        System.out.println("Result is here : ");
        System.out.println(printRomanNum(str));
    }
}
