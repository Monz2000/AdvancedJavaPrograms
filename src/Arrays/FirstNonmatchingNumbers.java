package Arrays;

import java.util.Scanner;

public class FirstNonmatchingNumbers {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr1[i] = sc.nextInt(); //taking user input values for the positions
			
		}

	    int[] arr2 = new int[n];
		
		for(int i =0;i<n;i++) {  
			
			arr2[i] = sc.nextInt(); 
			
		}
		
		for(int i=0;i<n;i++) {
			
			if(arr1[i]!=arr2[i]) {
				
				System.out.println(i);
				
			}
			
		}
		}
}