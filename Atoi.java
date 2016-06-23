package LintCode;

import java.util.Scanner;

public class Atoi {
	
	public static int atoi(String str) {
		boolean isNeg = false;
		int i = 0;
		int num = 0;
		
		if (str == null)
			return num;
		
		str = str.trim();
		
		if (str.isEmpty() )
			return num;
		
		if (str.charAt(i) == '-') {
			isNeg = true;
			i++;
		}
		while(i < str.length()) {
			char c = str.charAt(i++);
			if (!Character.isDigit(c)) {
				num = 0;
				break;
			}
				
			if (c == '.')
				break;
			
			if (i == 10) {
				if (isNeg) {
					return Integer.MIN_VALUE;
				}
				return Integer.MAX_VALUE;
			}
			num *= 10;
			num += c - '0';
		}
		
		if (isNeg) {
			num = -num;
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println("Enter string value");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int value = atoi(str);
		System.out.println(value);
	}

}
