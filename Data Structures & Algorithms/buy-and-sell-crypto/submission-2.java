class Solution {
    public int maxProfit(int[] prices) {
        int curr=0;
        int l=0;
        int r=1;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit=prices[r]-prices[l];
                curr=Math.max(curr,profit);
            } else {
                l=r;
            }
            r++;
        }
        return curr;
    }
}
