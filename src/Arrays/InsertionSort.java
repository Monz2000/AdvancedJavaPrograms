package Arrays;

import java.util.Scanner;

public class InsertionSort {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr =new int[n];
		
		for(int i =0;i<n;i++) { 
			
			arr[i]= sc.nextInt();
		}
		
		for(int i =1;i<n-1;i++) {//one is empty thats why n-1
			
			int key=arr[i];
			for(int j =i-1;j>=0;j--) {
				
			
			if(arr[j]>key) {
				
				arr[j+1]=arr[j];
			
			
			if(j==0) {
				arr[j]=key;
			}
			}
			else {
				arr[j+1]=key;
				break;
			}
		}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
		
}

}
