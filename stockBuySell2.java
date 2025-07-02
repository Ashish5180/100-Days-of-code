public class stockBuySell2 {
   
    public int maxProfit(int[] prices) {
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        stockBuySell2 s = new stockBuySell2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = s.maxProfit(prices);
        System.out.println("Total Profit from multiple transactions: " + result);
    }
}


