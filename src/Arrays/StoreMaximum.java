package Arrays;

import java.util.Scanner;

public class StoreMaximum {
	
	public static int findmax(int[] arr,int x,int y) {
		int Max =arr[x];
		
		for(int i =x;i<=y;i++) {
			if(Max<arr[i]) {
				Max = arr[i];
			}
		}
		return Max;
		
	}
	
	public static int findTrappedWater(int[] arr) {
		
		int n=arr.length,total =0;
		
		for(int i=0;i<n;i++) {
	
	int leftMax=findmax(arr,0,i);
	int rightMax=findmax(arr,i,n-1);
	
	int wall=Math.min(leftMax,rightMax);
    
    int waterabove= Math.max(wall - arr[i],0);
    
    total +=waterabove;
		}

return total;
}  //or

	/*public static int findTrappedWater(int[] arr) {
		
		int n=arr.length,total = 0;
		
		for(int i=0;i<n;i++) {
			
			int leftMax = arr[i];
			
			for(int j = 0;j<=i-1;j++) {
				
				if(leftMax<arr[j]) {
					
					leftMax = arr[j];
				}
			}
			int rightMax = arr[i];
			
              for(int j = i+1;j<=n-1;j++) {
				
				if(rightMax<arr[j]) {
					
					rightMax = arr[j];
			
		}
				
	}
              int wall=Math.min(leftMax,rightMax);
              
              int waterabove= wall - arr[i];
              
              total +=waterabove;
		}
		return total;
		} */
	
	

	public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  
		  int n=sc.nextInt();
		  
		  int[] arr= new int[n];
		  
		  for(int i =0;i<n;i++) {
			  
			  arr[i] = sc.nextInt();
		  }
		  
		  int result = findTrappedWater(arr);
		  
		  System.out.println(result);
		  
		  
}
}
