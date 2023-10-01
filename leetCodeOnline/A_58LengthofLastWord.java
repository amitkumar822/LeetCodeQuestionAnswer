package leetCodeOnline;

public class A_58LengthofLastWord {
    static int LastLength(String s){
        String str=s.trim();
        int count=0;
        int len=str.length();
        for(int i=len-1; i>=0; i--){
            if (str.charAt(i) != ' '){
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Final Last Word length : ");
        System.out.println(LastLength(s));
    }
}
