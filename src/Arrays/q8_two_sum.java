package Arrays;

import java.util.*;

//https://leetcode.com/problems/two-sum/

public class q8_two_sum {

    public static void main(String[] args) {
        int arr[] = {1,4,5,8,9,3,4};
        int target = 5;
        int ans[] = twoSumHashMap(arr,target);
        System.out.println(ans[0]+ " " + ans[1]);
    }

    public static int[] twoSumHashMap(int[] nums, int target) {  // optimized Using Hashmap
        int arr[] = {-1,-1};

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0;i<nums.length;i++){

            if(map.containsKey(target - nums[i])){
                arr[0] = i;
                arr[1] = map.get(target - nums[i]);
                return arr;
            }

            map.put(nums[i],i);
        }
        return arr;

    }


    public static int[] twoSum(int[] nums, int target) {   // brute force
        int arr[] = {-1,-1};
        for(int i = 0;i< nums.length-1;i++){
            for(int j = i +1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
