package day2;

import java.util.Scanner;

public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array= new int[n];
		
		for(int i =0; i<n; i++) {
			
			array[i] = sc.nextInt();
		}
		
		// Find the minimum element
		
		int min = array[0]; // Assume the first element is the minimum
		for(int i =1; i<n; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println(min);
	}

}
