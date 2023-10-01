package leetCodeOnline.Strings;

public class A_3_ShuffleString1528 {
    public static String ArrangeIndex(String s, int[] indices){
        int len=s.length();
        char[] arr = new char[len];
        for (int i=0; i<len; i++){
            arr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int indices[] = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println("Final arrange String : ");
        System.out.println(ArrangeIndex(s,indices));
    }
}
