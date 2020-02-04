//暴力破解，两次循环
public class Solution121 {
    public int maxProfit(int prices[]) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                //两次循环，找出最大值
                if (profit > max)
                    max = profit;
            }
        }
        return max;
    }
}
