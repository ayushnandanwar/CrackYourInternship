package Arrays;
//https://leetcode.com/problems/sort-colors/

public class q2_sort_colors {

    public static void main(String[] args) {
        int nums[] = {1,2,0,0,2,1};
        sortColors(nums);
//        System.out.println(nums.toString());
        for (int i:nums) {
            System.out.print(i+" ");
        }
    }


    public static void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int i = 0;
        while (start < end && i <= end) {
            if (nums[i] == 0) {
                nums[i] = nums[start];
                nums[start] = 0;
                start++;
                i++;
            } else if (nums[i] == 2) {
                nums[i] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                i++;
            }
        }
    }
}
