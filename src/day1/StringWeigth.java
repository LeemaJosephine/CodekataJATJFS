package day1;

import java.util.Scanner;

public class StringWeigth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(calculateWeight(s));
		
	}
	
	public static int calculateWeight(String str) {
		
		int weight = 0;
		for(int i =0 ; i < str.length(); i++) {
			
			char c = str.charAt(i);
			weight += (int) c;	
		}
		
		return weight;
	}

}
