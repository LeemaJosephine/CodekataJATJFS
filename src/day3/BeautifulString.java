package day3;

import java.util.Scanner;

public class BeautifulString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(isBeautiful(s));
		
		
	}
	
	public static int isBeautiful(String s) {
		
		int length = s.length();		
		// Check if the string has at least 3 characters
		if(length < 3){
			return 0;
		}
		
		// Check if the first character is 'a' or 'A'
		
		if(s.charAt(0) != 'a' && s.charAt(0) != 'A') {
			return 0;
		}
		
		// Check if the middle character is 'm' or 'M'
		
		char middelChar = s.charAt(length/2);
		System.out.println(middelChar);
		if(middelChar != 'm' && middelChar !='M') {
			return 0;
		}
		
		// Check if the last character is 'z' or 'Z'
		if(s.charAt(length-1) != 'z' && s.charAt(length-1) != 'Z') {
			return 0;
		}
		
		return 1;
	}

}
