package Arrays;

import java.util.Scanner;

public class SumOfElementsExceptIteself {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr[i] = sc.nextInt(); 
          }
		
		
			int sum =0;
			
			for(int j =0;j<n;j++) {
				
				sum +=arr[j];
			}
			
			for(int i=0;i<n;i++) {
				
				System.out.println(sum-arr[i]);//for addition,except the current value can be done using -(subtraction)
			}
			
			
			
			
		}
			

}

