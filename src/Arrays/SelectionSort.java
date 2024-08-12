package Arrays;

import java.util.Scanner;

public class SelectionSort {
	
	
	public static int findminPosition(int[] arr,int x,int y) {
		int MinPos = x;
		
		for(int i =x;i<=y;i++) {
			if(arr[i]<arr[MinPos]) {
				MinPos = i;
			}
		}
		return MinPos;
		
	}


public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr =new int[n];
		
		for(int i =0;i<n;i++) {
			
			arr[i]= sc.nextInt();
		}
		
	for(int i =0;i<n;i++) {
			
			int MinElePos=findminPosition(arr,i,n-1);
				int temp = arr[i];
				
				arr[i]=arr[MinElePos];
				
				arr[MinElePos]=temp;
			}
				
			
		
			
				
	
		   for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
		   }


}

}
