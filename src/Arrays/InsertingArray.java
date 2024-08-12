package Arrays;

import java.util.Scanner;

public class InsertingArray {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr =new int[n];
		
		for(int i =0;i<n-1;i++) { //one is empty thats why n-1
			
			arr[i]= sc.nextInt();
		}
		System.out.print("Enter target no:" );
		int target = sc.nextInt();
		
		for(int i =n-2;i>=0;i--) {
			
			if(arr[i]>target) {
				
				arr[i+1]=arr[i];
			}
			else {
				arr[i+1]=target;
				break;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
		
}

}
