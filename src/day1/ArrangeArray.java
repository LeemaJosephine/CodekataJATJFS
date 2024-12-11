package day1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int totalLenght = n + m;
		
		// Read the elements of the array
		int[] array1 = new int[n];
		int[] array2 = new int[m];
		
		for(int i =0; i < n; i++) {
			
			array1[i]= sc.nextInt();

		}
		
		for(int i =0; i < n; i++) {
			
			array2[i]= sc.nextInt();

		}
		
		Arrays.sort(array1);
		
		Arrays.sort(array2);
		reverse(array2);
		
		// Merge 2 array
		
		int[] mergedArray = new int[totalLenght];
		System.arraycopy(array1, 0, mergedArray, 0, n);
		System.arraycopy(array2, 0, mergedArray, n, m);
		
		for(int i=0; i < totalLenght; i++) {
			
			System.out.print(mergedArray[i]+" ");
		}
		
	}
	
	public static void reverse(int[] arr) {
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		
		
		
	}

}
