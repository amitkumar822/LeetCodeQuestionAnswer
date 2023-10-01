package leetCodeOnline;

import java.util.HashMap;

public class TwoSum1_BestTime {
    static int[] isIndex(int[] num, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<num.length; i++){
            if (map.containsKey(target-num[i])){
                return new int[]{map.get(target-num[i]),i};
            }
            map.put(num[i],i);
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
