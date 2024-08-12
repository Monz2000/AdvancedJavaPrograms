package Arrays;

import java.util.Scanner;

public class FirstNonMatchingNumbFromEnd {

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
		
		int ans = -1;
		
		for(int i=0;i<n;i++) {
			
			if(arr1[i]!=arr2[i]) {
				
				ans=i;
				
				}
			
		}
		
		System.out.print(ans);
		}
}

