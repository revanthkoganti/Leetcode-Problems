package dataStructures;
import java.util.HashMap;
import java.util.Map;
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
    	Map<String,Integer> smap = new HashMap();
    	Map<String,Integer> tmap = new HashMap();
    	
    	for(int i=0;i<s.length();i++) {
    		if(smap.containsKey(s.substring(i, i+1))) {
    			smap.put(s.substring(i, i+1),smap.get(s.substring(i, i+1))+1);
    		}
    		else {
    			smap.put(s.substring(i, i+1), 1);
    		}
    	}
    	for(int i=0;i<t.length();i++) {
    		if(tmap.containsKey(t.substring(i, i+1))) {
    			tmap.put(t.substring(i, i+1),tmap.get(t.substring(i, i+1))+1);
    		}
    		else {
    			tmap.put(t.substring(i, i+1), 1);
    		}
    	}
    
    	return smap.equals(tmap);
    	
    }
}
