package leetCodeOnline;

public class RemoveDuplicatesfromSortedArray26 {
    static void removeDuplicate(int[] num){
        int count =0;
        for(int i=0; i<num.length; i++){
            if(num[count] != num[i]){
                count++;
                num[count] = num[i];
                int ans=num[count];
                System.out.print(ans+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Final Sorted ZZ_StartingTimePr.Array : ");
        removeDuplicate(num);
    }
}
