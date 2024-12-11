package day1;

import java.util.Scanner;

public class PatternProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		// Step 1: Identify the no.of rows = how many times the outer loop should run
		
		for(int i =1; i<=n ; i++) {
			
			// Step 2: Identify the number of columns = how many times the inner loop should run
			
			for(int j =1; j <=n ; j++) {
				
				// Step 3: Identify what needs to be printed
				System.out.print("1");
				
			}
			
			System.out.println();
		}
	}

}
