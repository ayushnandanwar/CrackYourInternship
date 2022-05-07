package Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/   1

public class q6_best_time_to_buy_stock {

    public static void main(String[] args) {
        int arr[] = {7,4,2,1,9,3,4};
        System.out.println(maxProfitOptimized(arr));

    }

    public static int maxProfitOptimized(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0;i < prices.length;i++){

            if(prices[i] < min){
                min = prices[i];
            }
            else if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }
        return profit;

    }


    public static int maxProfit(int[] prices) {  // brute force method

        int profit = 0;
        for(int i = 0;i< prices.length-1;i++){

            for(int j = i +1;j < prices.length;j++){
                if(profit < (prices[j] - prices[i])){
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }
}
