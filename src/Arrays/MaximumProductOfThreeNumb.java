package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductOfThreeNumb {
	
	public static int maxTripleVal(int[] arr,int n) {
		
		Arrays.sort(arr);
		return Math.max(arr[0]*arr[1]*arr[n-1],arr[n-3]*arr[n-2]*arr[n-1]);
	}
	

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i =0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
	/*int ans=arr[0]*arr[1]*arr[2];
		
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(i!=j) {
					
					for(int k=j+1;k<n;k++) {
						if(k!=i&&k!=j) {
							
							ans=Math.max(ans,arr[i]*arr[j]*arr[k]);
						}
					}
				}
			}
			
			
}*/
		System.out.println(maxTripleVal(arr,n));
}
}
