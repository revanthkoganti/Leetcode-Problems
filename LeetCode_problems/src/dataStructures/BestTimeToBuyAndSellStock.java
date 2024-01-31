package dataStructures;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		 int profit=0;
		 int bp=prices[0];

	     for(int i=1;i<prices.length;i++) {
	       		if(bp>prices[i]) {
	       			bp=prices[i];
	       		}
	       		else {
	       			if(profit<prices[i]-bp) {
	       				profit = prices[i]-bp;
	       			}
	       		}
	       	}
	     return profit;

	 }
}
