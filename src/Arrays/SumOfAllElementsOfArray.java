package Arrays;

import java.util.Scanner;

public class SumOfAllElementsOfArray {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr[i] = sc.nextInt(); 
          }
		
		int sum = 0;
		
		for(int i =0;i<arr.length;i++) {
			
			
			sum = sum+arr[i];
		}
		
		System.out.println(sum);
				
		}			
}
