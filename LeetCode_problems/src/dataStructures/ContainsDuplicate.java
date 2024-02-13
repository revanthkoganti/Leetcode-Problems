package dataStructures;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
    	HashMap map = new HashMap();
    	for(int i=0;i<nums.length;i++) {
    		if(!map.containsKey(nums[i])) {
    			map.put(nums[i], nums[i]);
    		}
    		else {
    			return true;
    		}
    	}
    	
    	return false;
    }
}
