package easy;

/**
 * 买卖股票最佳时机
 */
public class E121 {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int tmp = prices[i];
            for (int j= i+1; j<prices.length; j++){
                if (prices[j]<prices[i]) continue;
                int tmpMax = prices[j] - prices[i];
                if (tmpMax>max) max = tmpMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int out = maxProfit(prices);

        System.out.println(out);
    }
}
