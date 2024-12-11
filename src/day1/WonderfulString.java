package day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WonderfulString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(isWonderful(s)) {
			
			System.out.println("Wonder");
		} else {
			
			System.out.println("-1");
		}
		
	}
	
	public static boolean isWonderful(String str) {
		
		Set<Character> charSet = new HashSet<Character>();
		
		for(char c : str.toCharArray()) {
			
			charSet.add(c);
			
			if(charSet.size() > 3) {
				
				return false;
			}
		}
		
		return charSet.size() == 3;
	}

}
