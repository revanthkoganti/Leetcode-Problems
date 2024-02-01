package dataStructures;

import dataStructures.DynamicArray;

public class MainClass {
    public static void main(String[] args) {
    	int[][] prices = {{2,4},{5,7},{8,10},{11,13}};
    	int[] newint = {3,6};
    	InsertInterval b = new InsertInterval();
 
    	int[][] r=b.insert(prices,newint);
    	for(int i=0;i<r.length;i++) {
    		System.out.println(r[i][0]+","+r[i][1]);

    	}
    }
}
