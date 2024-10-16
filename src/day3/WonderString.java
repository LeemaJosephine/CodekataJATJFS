package day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WonderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(isWonderful(input)) {
			System.out.println("Wonder");
		} else {
			System.out.println("-1");
		}
		
	}
	
	public static boolean isWonderful(String input) {
		
		Set<Character> charSet = new HashSet<Character>();
		for( char c : input.toCharArray()) {
			charSet.add(c);
			if(charSet.size() > 3) {
				return false; // More than 3 different characters.
			}
		}
		
	return charSet.size() == 3; 
	}

}
