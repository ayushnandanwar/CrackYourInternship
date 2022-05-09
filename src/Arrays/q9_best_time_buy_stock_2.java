package Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/  2

public class q9_best_time_buy_stock_2 {

    public static void main(String[] args) {
        int arr[] = {4,5,6,2,9,7};
        System.out.println(maxProfit(arr));
    }


    public static int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1;i< prices.length;i++){

            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;
    }
}
