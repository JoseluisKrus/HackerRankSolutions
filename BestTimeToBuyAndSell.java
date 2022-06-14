public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int maximumProfit = 0;
        int l =0;
        int r = 1;
        while (r < prices.length){
            if(prices[l]<prices[r]){
                int profit = prices[r] - prices[l];
                maximumProfit = Math.max(maximumProfit, profit);
            }else {
                l = r;

            }
            r++;
        }

    }
}
