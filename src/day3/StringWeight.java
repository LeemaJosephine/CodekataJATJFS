package day3;

import java.util.Scanner;

public class StringWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = 9;
		double b = a;
		System.out.println(b);
		
		double c = 9.60;
		int d = (int) c;
		
		System.out.println(d);
		
		
		
		String str = sc.nextLine();
		System.out.println(calculateWeight(str));
		
	}
	
	public static int calculateWeight(String s) {
		
		int weight=0;
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i); 
			weight += (int) c; // type casting(converting the value of one data type to another data type)  char to int  
			
		}
		
		return weight;
	}

}
