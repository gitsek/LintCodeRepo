package LintCode;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {

	public ArrayList<String> fizzBuzzSol(int n) {
		ArrayList<String> fizzBuzzlst = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if((i%5) == 0 && (i%3) == 0) {
				fizzBuzzlst.add("fizz buzz");
			}
			else if ((i%5) == 0) {
				fizzBuzzlst.add("buzz");
			} else if ((i%3) == 0) {
				fizzBuzzlst.add("fizz");
			} else {
				fizzBuzzlst.add(String.valueOf(i));
			}
		}
		return fizzBuzzlst;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		FizzBuzz fbObj = new FizzBuzz();
		ArrayList<String> lst = fbObj.fizzBuzzSol(n);
		System.out.println(lst);
	}

}
