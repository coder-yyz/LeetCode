//假设每一天买进，第二天卖出。每天的利润为p[i+1]-p[i]（利润可能为负）
//最大利润就是所有的正数利润之和，负利润时停止买进
class Solution122 {
        public int maxProfit(int[] prices) {
            int max = 0;
            for(int i = 0;i<prices.length-1;i++){
                if(prices[i+1]-prices[i]>0) max+=prices[i+1]-prices[i];
            }
            return max;
        }
}