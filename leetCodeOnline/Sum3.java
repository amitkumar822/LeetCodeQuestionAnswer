package leetCodeOnline;
import java.util.*;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.List;

class Sum3 {
    public static List<List<Integer>> print(int[] nums){
        int target = 0;
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        output.addAll(s);
        return output;
    }
    public static void main(String[] args) {
          int[] nums = {-1,0,1,2,-1,-4,8,-3,-5};
        System.out.println(print(nums));
    }
}

/*
[[-1, -1, 2], [-5, -3, 8], [-3, 1, 2], [-1, 0, 1]]
 */