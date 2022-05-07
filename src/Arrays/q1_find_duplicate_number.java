package Arrays;

//https://leetcode.com/problems/find-the-duplicate-number/

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//        There is only one repeated number in nums, return this repeated number.
//
//        You must solve the problem without modifying the array nums and uses only constant extra space.
public class q1_find_duplicate_number {

    public static void main(String[] args) {
        int nums[] = {1,4,3,1,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {  // Negative Marking
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.abs(nums[i])-1;
            if (nums[cur] < 0) {
                duplicate = cur+1;
                break;
            }
            nums[cur] *= -1;
        }

        // Restore numbers
        for (int i = 0; i < nums.length; i++)
            nums[i] = Math.abs(nums[i]);

        return duplicate;
    }
}
