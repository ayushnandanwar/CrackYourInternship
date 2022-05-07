package Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class q3_remove_duplicates_from_sorted_array {

    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] arr) {
        int p = 1;

        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                arr[p++] = arr[i+1];
            }
        }
        return p;
    }

}
