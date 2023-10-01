package leetCodeOnline;

public class TwoSum1 {
    //this method work fine but time complexity more consume
    public static int[] isIndex(int[] num, int target){
        int len= num.length;
        for (int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
                if (num[i]+num[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] num = {2, 5, 11,7, 15};
        int target = 9;
        int[] res=isIndex(num,target);
        System.out.println("Final index answer: ");
        for (int ans:res){
            System.out.print(ans+" ");
        }
    }
}
