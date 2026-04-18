public class stockBuySell {
     public int maxProfit(int[] prices){
        int maxProfit = 0;
     
      int minPrice = prices[0];
      for(int i=1;i<prices.length;i++){
          int profit = prices[i]-minPrice;
          maxProfit = Math.max(profit,maxProfit);
          minPrice = Math.min(minPrice, prices[i]);
      }

        return maxProfit;
     }
}
