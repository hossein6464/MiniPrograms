package assignment4;

public class ProfitStock {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        int minBuy = prices[0];
        int profit = 0;
        int holdIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
                holdIndex = i;
            }
        }
        int minSell = prices[holdIndex];
        for (int j = holdIndex + 1; j < prices.length; j++) {
            if (prices[j] > minSell) {
                minSell = prices[j];
            }
        }
        profit = minSell - minBuy;
        System.out.println(profit);
    }
}



