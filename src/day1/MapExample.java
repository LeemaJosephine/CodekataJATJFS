package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] prisonerIds = new int[n];
		for(int i = 0; i<n;i++) {
			
			prisonerIds[i]=sc.nextInt();
		}
		
		// Map
		
		Map<Integer, Integer> idCount = new HashMap<Integer, Integer>();
		
		for(int id : prisonerIds) {
			
			idCount.put(id, idCount.getOrDefault(id, 0)+1);
		}
		
		boolean foundCommonId = false;
		for(Map.Entry<Integer, Integer> entry: idCount.entrySet()) {
			
			if(entry.getValue() > 1) {
				
				System.out.println(entry.getKey()+" ");
				foundCommonId = true;
			}
		}
		
		if(!foundCommonId) {
			
			System.out.println("-1");
		}
	}

}
