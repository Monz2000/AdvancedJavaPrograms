package Arrays;

import java.util.Scanner;

public class ReversePrint {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr[i] = sc.nextInt(); //taking user input values for the positions
			
		}
		
		for(int j = n-1;j>=0;j--){ // need to print output of what user has given,taking those 5 value
			
			System.out.print(arr[j] + " "); //printing user input values
		}
	}


}
