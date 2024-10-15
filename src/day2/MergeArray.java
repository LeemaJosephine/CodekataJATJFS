package day2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Read the length of the arrays
		int n = sc.nextInt();
		int m = sc.nextInt();
		int totallength = n +m;
		
		// Create an array and read the inputs from user
		
		int[] array1 = new int[n];
		int[] array2 = new int[m];
		
		for(int i=0; i<n; i++) {
			
			array1[i] = sc.nextInt();
		}
		
		for(int i =0; i<m ; i++) {
			
			array2[i] = sc.nextInt();
		}
		
		// Sort array1 in ascending order
		Arrays.sort(array1);
		
		//Sort array2 in descending order
		Arrays.sort(array2);
		reverse(array2);
		
		//Merge the two arrays
		int[] mergedArray = new int[totallength];  
		System.arraycopy(array1, 0, mergedArray, 0, n);  
		System.arraycopy(array2, 0, mergedArray, n, m);
		
		// print the merged array
		for(int i=0; i<totallength;i++) {
			
			System.out.print(mergedArray[i]+" ");
		}
		
	}
	
	public static void reverse(int[] arr) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
			
		}
		
		
	}

}
