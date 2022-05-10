package MathematicaProblems;

//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
import java.util.*;
public class q1_Minimum_moves_to_equal_arrays {

    public static void main(String[] args) {
        int arr[] = {1,3,2};
        System.out.println(minMoves(arr));
    }
    public static int minMoves(int[] nums) {

        Arrays.sort(nums);
        int res = 0;

        for(int i = nums.length - 1;i >= 0 ;i--){
            res += nums[i] - nums[0];
        }
        return res;
    }

}
