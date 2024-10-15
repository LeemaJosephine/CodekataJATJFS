package day2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Get length of the list
		
		int n = sc.nextInt();
		
		// Create array
		
		String[] pass = new String[n];
		
		// read input from user and store in array
		
		for(int i=0; i<n; i++) {
			
			pass[i]=sc.next();
		}
		
		Set<String> passports = new LinkedHashSet<String>();
		
		for(String passport : pass) {
			
			passports.add(passport);
		}
		
		for(String passp : passports) {
			
			System.out.print(passp+" ");
		}
	}

}
