package Arrays;

import java.util.*;

public class ArraysOfsizeN {
	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			
			for(int i =0;i<n;i++) {  //arranging 5 position
				
				arr[i] = sc.nextInt(); //taking user input values for the positions
				
			}
			
			for(int j = 0;j<n;j++){ // need to print output of what user has given,taking those 5 value
				
				System.out.println(arr[j]); //printing user input values
			}
		}

	}




