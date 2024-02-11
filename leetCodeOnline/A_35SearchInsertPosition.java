package leetCodeOnline;

public class A_35SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1] < target){//6 < 7
            return nums.length;
        }
        int ans = -1;
        //found case
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                ans = i;
                break;
            }else{//1,3,5,6 tr=2
                if((nums[i] > target)){// i
                    ans = i;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] nums = {1,3,5,6};
        int[] nums = {1,3,5,6}; //1 tr=2
//        int target = 5; //2
        int target = 4;
        System.out.println(searchInsert(nums,target));
    }
}
