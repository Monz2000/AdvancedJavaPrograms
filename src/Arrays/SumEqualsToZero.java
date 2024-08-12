package Arrays;

import java.util.Scanner;

public class SumEqualsToZero {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i =0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		
		
		for(int i=0;i<n;i++){
			int sum =0;
			for(int j=i;j<n;j++) {
				
				sum=sum+arr[j];
				
				
					if(sum==0) {
						
						System.out.print("true");
					}
					else {
						System.out.print("false");
					}
				}
			}
		}
		
		
}


