package Arrays;

//https://leetcode.com/problems/subarray-sums-divisible-by-k/


//Input: nums = [4,5,0,-2,-3,1], k = 5
//        Output: 7
//        Explanation: There are 7 subarrays with a sum divisible by k = 5:
//        [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

import java.util.HashMap;

public class q10_subarray_sum_divisible_by_k {
    public static void main(String[] args) {
        int nums[] = {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(nums,5));
        int n[] = {5};
        System.out.println(subarraysDivByK(n,9));

    }
    public static int subarraysDivByKHashMap(int[] nums, int k) {
        int curSum = 0;
        int count = 0;
        return 0;
    }

        public static int subarraysDivByK(int[] nums, int k) {  // brute force
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            int sum = 0;
            int j = i;
            while(j >= 0){
                sum += nums[j--];
                if(sum%k == 0){
                    count++;
                }
            }
        }
        return count;
    }


}
