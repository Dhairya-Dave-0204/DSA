public class PracticeBuyAndSell {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 3, 4 };

        System.out.println("Total Profit: " + calculateProfit(prices));
    }

    public static int calculateProfit(int prices[]) {
        int maxProfit = 0;        
        int buy = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buy < prices[i]) {
                int profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = prices[i];
            }
        }


        return maxProfit;
    }
}
