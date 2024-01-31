package dataStructures;

import dataStructures.DynamicArray;

public class MainClass {
    public static void main(String[] args) {
    	int[] prices = {2,1,4};
    	BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
    	System.out.print(b.maxProfit(prices));
    }
}
