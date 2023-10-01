package leetCodeOnline;

public class ReverseWordsinaString151 {
    public static String reverseWord(String str){
        String[] word = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i= word.length-1; i>=0; i--){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();

    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println("Final Reverse : ");
        System.out.println(reverseWord(str));
    }
}
