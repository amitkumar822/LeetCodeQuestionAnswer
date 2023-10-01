package leetCodeOnline;

public class A_28FindtheIndexoftheFirstOccurrenceinaString {
    static int FindeOccIndex(String hay, String needle){
        int h=hay.length();
        int n=needle.length();
        if(h < n) return -1;
        for(int i=0; i<h-n; i++){
            int j=0;
            while (j<n && hay.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if (j==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "ranrajatsadkfg", needle = "sad";
        System.out.println(FindeOccIndex(haystack, needle));
    }
}
