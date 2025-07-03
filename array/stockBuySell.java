class stockBuySell {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        stockBuySell s = new stockBuySell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = s.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}
