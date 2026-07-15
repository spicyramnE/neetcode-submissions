class Solution {
    public int maxProfit(int[] prices) {
        int curr=0;
        for(int i=0;i<prices.length;i++){
            int buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
                int sell=prices[j];
                curr=Math.max(curr,sell-buy);
            }
        }
        return curr;
    }
}
