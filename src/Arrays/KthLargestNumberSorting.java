package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestNumberSorting {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :");
		int n = sc.nextInt();
		System.out.print("Enter k :");
		int k = sc.nextInt();
		
		int[] arr =new int[n];
		
		for(int i =0;i<n;i++) { 
			System.out.print("Enter arr[i] values of"+" "+i+":");
			arr[i]= sc.nextInt();
		}
		//inbuilt func to sort array
		Arrays.sort(arr); //using bubble sort
		
		//for(int i=0;i<n;i++) {
		//System.out.print(arr[i]+" ");
		//}
		System.out.print(arr[n-k]);
}
}
