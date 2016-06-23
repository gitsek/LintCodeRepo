package LintCode;

import java.util.Scanner;

public class CompareStrSol {

	public boolean compareStr(String A, String B) {
	
		if ( A == null || B == null || (A.length() < B.length())) {
			return false;
		}
		if(A.isEmpty()) {
			return false;
		}
		if (B.isEmpty()) {
			return true;
		}
		
		for(int i=0; i < B.length(); i++) {
			char bchar = B.charAt(i);
			int index = A.indexOf(bchar);
			if(index == -1) {
				return false;
			} else {
				if (index == 0) {
					A = A.substring(index + 1);
				} else {
					A = A.substring(0, index) + A.substring(index + 1);
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string A");
		String A = scan.nextLine();
		
		System.out.println("Enter string B");
		String B = scan.nextLine();
		
		CompareStrSol cObj = new CompareStrSol();
		if (cObj.compareStr(A, B)) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

}
