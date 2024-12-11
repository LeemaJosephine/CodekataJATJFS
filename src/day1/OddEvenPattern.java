package day1;

import java.util.Scanner;

public class OddEvenPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row=1; row <=n ; row++) {
			
			if(row%2!=0) {
				
				for(int col=1 ; col <= n + 1 - row; col++) {
					
					System.out.print(col);
				}
			} else {
				
				for(int col1=n + 1 - row; col1 >0; col1--) {
					
					System.out.print(col1);
				}
			}
			
			System.out.println();
		}
		
		}
	}


