package Arrays;

//https://leetcode.com/problems/container-with-most-water/


//Input: height = [1,8,6,2,5,4,8,3,7]
//        Output: 49

public class q12_container_with_most_water {

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxAreaOptimize(int[] height){
        int ans=0;
        int left=0;
        int right=height.length-1;
        while (left<=right){
            ans=Math.max(Math.min(height[left],height[right])*(right-left),ans);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;

    }


    public static int maxArea(int[] height) {  // Brute force O(N^2)
        int max = 0;

        for(int i = 0;i< height.length - 1;i++){
            for(int j = i + 1;j <height.length;j++){
                if(height[i] < height[j]){
                    if(height[i]*(j-i) > max){
                        max = height[i]*(j-i);
                    }
                }
                else{
                    if(height[j]*(j-i) > max){
                        max = height[j]*(j-i);
                    }
                }

            }
        }
        return max;
    }
}
