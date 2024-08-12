package Arrays;

import java.util.Scanner;

public class CompositeNumberOfArray {
	
public static boolean isPrime(int num) {
		
		if(num<=1) {
			
			return false;
		}
	
		
		for(int i =2;i*i<=num;i++) {
			
			if(num%i==0) {
				
				return false;
			}
		}
		return true;
	}
			
			
			
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
       int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		for(int i =0;i<n;i++) {
			
			if(arr[i]>1 && isPrime(arr[i])==false) {
				
				System.out.print(arr[i] + " ");
			}
		}

}
}