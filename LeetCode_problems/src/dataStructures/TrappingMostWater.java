package dataStructures;

import java.util.Arrays;

public class TrappingMostWater {
	public int trap(int[] height) {
	    int l = 0;
	    int r = height.length - 1;
	    int maxLeft = 0; 
	    int maxRight = 0;
	    int trapWater = 0; 
	    
	    while (l < r) {
	        if (height[l] <= height[r]) {
	            if (height[l] >= maxLeft) {
	                maxLeft = height[l];
	            } else {
	                trapWater += maxLeft - height[l]; // Corrected here
	            }
	            l++; 
	        } else {
	            if (height[r] >= maxRight) {
	                maxRight = height[r];
	            } else {
	                trapWater += maxRight - height[r];
	            }
	            r--; 
	        }
	    }
	    
	    return trapWater;
	}


}
