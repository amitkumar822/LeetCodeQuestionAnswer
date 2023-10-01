package leetCodeOnline;

public class A_27RemoveElementGivenTarget {
    static void remove(int[] num, int target){
        int count =0;
        for(int i=0; i<num.length; i++){
            if (num[i] != target){
                num[count] = num[i];
                int ans=num[count];
                System.out.print(ans+" ");
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {3, 2,3,5,7,3,1, 2, 3};
        int target = 3;
        remove(num, target);
    }
}
