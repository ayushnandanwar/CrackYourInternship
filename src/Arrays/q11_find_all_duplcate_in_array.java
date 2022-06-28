package Arrays;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

//Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [2,3]

import java.util.*;

public class q11_find_all_duplcate_in_array {

    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            if(map.contains(nums[i])){
                l.add(nums[i]);
            }
            map.add(nums[i]);
        }
        return l;
    }
}
