package dataStructures;

import dataStructures.DynamicArray;

public class MainClass {
    public static void main(String[] args) {
    	int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
    	TrappingMostWater t = new TrappingMostWater();

  		System.out.println(t.trap(nums));

    }
}
