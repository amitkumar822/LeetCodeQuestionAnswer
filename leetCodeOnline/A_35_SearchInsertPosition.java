package leetCodeOnline;

public class A_35_SearchInsertPosition {
    //2nd method int
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high - low);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    // 1st method void
    public static void FindIdxVal(int[] num, int target){
        int len = num.length;
        for(int i=0; i<len; i++){
            if (num[i] == target){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println("First method answer : ");
        FindIdxVal(nums, target);
        System.out.println("Second Answer : ");
        System.out.println(searchInsert(nums, target));
    }

}
