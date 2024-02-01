package dataStructures;

import java.util.ArrayList;

public class InsertInterval {
	
	public int[][] insert(int[][] intervals, int[] newInterval) {
		ArrayList<int[]> result = new ArrayList<>();
		int flag=0;
		if (intervals.length == 0) {
			result.add(newInterval);
		} 
		else if (newInterval[1] < intervals[0][0]) {
	    	result.add(newInterval);
	        for (int i = 0; i < intervals.length; i++) {
	        	result.add(intervals[i]);
	        }
	    } else if (newInterval[0] > intervals[intervals.length - 1][1]) {
	        for (int i = 0; i < intervals.length; i++) {
	            result.add(intervals[i]);
	        }
	        result.add(newInterval);
	    } else {
	        int i = 0;
	        while (i < intervals.length) {
	        	if (newInterval[0] > intervals[i][1]) {
	        		result.add(intervals[i]);
	                i++;
	            } else if (newInterval[1] < intervals[i][0]) {
	            	if(flag==0) {
	            		result.add(newInterval);
	            		flag=1;
	            	}
	                
	                result.add(intervals[i]);
	                i++;
	            } else{
	            	newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
	                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
	                i++;
	                if(i == intervals.length) {
	                	result.add(newInterval);
	                }
	            }
	        }
	    }
        int[][] resultArray = result.toArray(new int[0][]);

        return resultArray;
    }
}
