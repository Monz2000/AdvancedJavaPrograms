package Arrays;

import java.util.Scanner;

public class PrintPair {

	public static void printpairs(int[] arr) {
		
		for(int i = 0;i<arr.length;i++) {
			
			for(int j = i+1;j<arr.length;j++) {
				
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		printpairs(arr);
	}
}
