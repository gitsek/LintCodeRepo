package LintCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Anagram {

	public boolean anagram(String s, String t) {
		if (s == null && t == null ) {
			return true;
		}
		if (s == null || t == null || (s.trim().length() != t.trim().length()))
			return false;
		
		s = s.trim();
		t = t.trim();
		
		for(int i = 0 ; i < s.length(); i++) {
			int index = t.indexOf(s.charAt(i));
			if (index == -1)
				return false;
			if (index != 0) {
				t = t.substring(0, index) + t.substring(index + 1);
			} else {
				t = t.substring(index + 1);
			}
		}
		return true;
	}
	
    public List<String> anagrams(String[] strs) {
    	ArrayList<String> anagramLst = new ArrayList<String>();
    	boolean isAdded = false;
    	
    	for(int i = 0; i < strs.length; i++) {
    		isAdded =false;
    		if (strs[i] == null)
    			continue;
    		
    		for( int x = i + 1; x < strs.length; x++) {
    			if (strs[x] == null ) {
    				continue;
    			}
        		if (anagram(strs[i], strs[x]) ) {
        			if (!isAdded) {
        				anagramLst.add(strs[i]);
        				isAdded =true;
        			}
        			anagramLst.add(strs[x]);
        			strs[x] = null;
        		}    			
    		}
    	}
    	
    	return anagramLst;
    }
    
	public static void main(String[] args) {
		Anagram anag = new Anagram();
		System.out.println("is anagram : " + anag.anagram("", ""));
		String[] strs = {"ab", "ba", "cd", "dc", "e"};
		List<String> anagramLst = anag.anagrams(strs);
		System.out.println(anagramLst);
	}

}
