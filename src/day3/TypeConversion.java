package day3;

import java.util.Scanner;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int T = sc.nextInt();
		int P = sc.nextInt();
		
		System.out.println(performConversion(s, T, P));
		
	}
	
	public static StringBuilder performConversion(String s , int conversionType, int P) {
		
		StringBuilder result = new StringBuilder();
		
		for(int i =0; i<s.length();i++){
			
			char c = s.charAt(i);
			
			//Check if the index is a multiple of P - 2 -> 2 % 2 = 0 
	
			if((i+1) % P == 0) {
				
				// perform the conversion based on concersion type
				if(conversionType == 1) {
					result.append(Character.toLowerCase(c));
				} else if (conversionType == 2) {
					result.append(Character.toUpperCase(c));
				}
			} else {
				result.append(c);
			}
			
		}
		
		return result;
		
		
	}

}
