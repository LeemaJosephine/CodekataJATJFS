package day2;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] array = new int[N];
		for(int i =0; i<N; i++) {
			
			array[i]=sc.nextInt();
		}
		
		
		//Check if K exists in the array
		boolean found = false;
		for(int i =0; i < N ; i++) {
			if(array[i] == K) {
				found = true;
				break;
			}
		}
		
		if(found) {
			
			System.out.println("yes");
		} else {
			
			System.out.println("no");
		}
	}

}
