package day3;

import java.util.Scanner;

public class EngineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String plateNumber = sc.nextLine();
		
		System.out.println(calculateEngineNumber(plateNumber));
		
	}

	public static int calculateEngineNumber(String str) {
		
		int enginenumber = 0;
		for(int i =0; i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(Character.isDigit(c)) {
				
				enginenumber += Character.getNumericValue(c);
			}
			// HA05 -> H A 0 5
		}
		
		return enginenumber;
	}
}
