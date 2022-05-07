package Arrays;

//https://leetcode.com/problems/move-zeroes/

public class q5_move_zeroes {

    public static void main(String[] args) {
        int arr[] = {1,2,0,0,4,0,3};
        printArr(arr);
        moveZeroesOptimize(arr);
        System.out.println();
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for (int el:arr) {
            System.out.print(el + " ");
        }
    }
    public static void moveZeroesOptimize(int[] nums) {  // Optimized
        int s = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[s++] = nums[i];  // Putting all non zero values to the start
            }
        }
        while(s < nums.length){
            nums[s++] = 0;  // putting zeros to the rest of end
        }
    }

    public static void moveZeroes(int[] nums) {  // Using extra spaces solutions
        int arr[] = new int[nums.length];
        int end = nums.length - 1;
        int start = 0;
        for(int i = 0;i< nums.length;i++){

            if(nums[i] == 0){
                arr[end] = 0;
            }else{
                arr[start++] = nums[i];
            }
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = arr[i];
        }
    }
}
