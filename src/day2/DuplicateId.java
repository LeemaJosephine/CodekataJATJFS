package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] prinsonerIDs = new int[n];
		
		for(int i=0; i<n ;i++) {
			
			prinsonerIDs[i]= sc.nextInt();
		}
		
		// create a HashMap -> to count the occurance of each id
		
		Map<Integer, Integer> idCountMap = new HashMap<Integer, Integer>();
		for(int id : prinsonerIDs) {
			
			idCountMap.put(id, idCountMap.getOrDefault(id, 0) + 1);
	
		}
		
		//Find common id
		boolean foundCommonId = false;
		for(Map.Entry<Integer, Integer> entry : idCountMap.entrySet()) {
			
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey()+" ");
				foundCommonId = true;
			}
		}
		
		// if no common ids were found, print -1
		if(!foundCommonId) {
			
			System.out.print("-1");
		}
			
			
	}

}
