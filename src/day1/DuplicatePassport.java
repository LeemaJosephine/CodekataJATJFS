package day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatePassport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        sc.nextLine();
        String[] passports = sc.nextLine().split(" ");
        
        Set<String> uniquePassports = new HashSet<>();
        
        for(String passport : passports){
            
            uniquePassports.add(passport);
        }
        
        for(String passport : uniquePassports){
            
            System.out.print(passport+" ");
        }
        	
        //sc.close();	
	}

}
