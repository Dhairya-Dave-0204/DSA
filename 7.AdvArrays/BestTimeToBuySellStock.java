public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.print("The array of prices is: ");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.print("\n" + "The maximum profit is: " + buyAndSellStocks(prices));
    }

    public static int buyAndSellStocks (int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // Here pries[i] is the current price or the selling price
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i]; // If no profit can be obtained then update buying price to current price
            }
        }
        return maxProfit;
    }
}
