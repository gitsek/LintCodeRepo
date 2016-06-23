package LintCode;

import java.util.Scanner;

public class StrStr {

	public int strStr(String source, String target) {
	
		if(source == null || target == null || source.length() < target.length()) 
			return -1;
		
		int tLength = target.length();
		int sLength = source.length();
		
		if(source.isEmpty()) {
		    return 0;
		}
		if (target.isEmpty()) {
			return 0;
		}
		
		for(int i = 0; i < source.length(); i++) {
			if (source.charAt(i) == target.charAt(0) && (sLength -i) >= tLength) {
				// Check if the substrings are equal
				String str = source.substring(i, (i + tLength));
				if (str.equals(target))
					return i;
			}
		}
		// if no match.
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter source string");
		Scanner scan = new Scanner(System.in);
		String sourceStr = scan.nextLine();
		System.out.println("Enter target string");
		String tStr = scan.nextLine();
		StrStr stObj = new StrStr();
		System.out.println(stObj.strStr(sourceStr, tStr));

	}
}
