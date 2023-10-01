package leetCodeOnline;

public class A_66_PlusOne {
    static int[] Sum(int[] num){
        int n=num.length;
        for (int i=n-1; i>=0; i--){
            if (num[i] != 9){
                num[i]++;
                break;
            }else {
                num[i]=0;
            }
        }
        if (num[0]==0){
            int[] res = new int[n+1];
            res[0]=1;
            return res;
        }
        return num;
    }
    public static void main(String[] args) {
        int[] num={1,2,9};
        int[] rs=Sum(num);
        for (int ans:rs) System.out.print(ans+" ");
    }
}
