package day1;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =1;
		
		for(int i=1; i<=n ; i++) {
			
			for(int j = 1; j <=i; j++) {
				if(i > j) {
				System.out.print(k+ " ");
				} else {
					System.out.print(k);
				}
				k++;
			}
			
			System.out.println();
		}
	}

}
