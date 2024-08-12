package Arrays;

import java.util.*;

public class IsIdentical {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// declaring first array
		
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		
		for(int i =0;i<n;i++) 
		{
			arr1[i] = sc.nextInt();
			
		}
		
		// declaring second array
		
         int m = sc.nextInt();
		
		int[] arr2 = new int[m];
		
		for(int i =0;i<m;i++) 
		{
			arr2[i] = sc.nextInt();
			
		}
		
		//checking if it identical or not by if condition
		
		if(n!=m)
		{
			System.out.println("false");
			
		}
		
		/*else {
			System.out.println("true");
		}*/
			
		
		else // if its true, we need to check each position and their elements are same,
			//can simply print else true but we need to check in these different scenerio , if in case 
		{
			boolean ans = true;
			for(int i = 0; i < m;i++) 
			{
				if(arr1[i]!=arr2[i]) {
					
					ans = false;
				}
				
				System.out.println(ans);
			}
			
			
		}
	}
}

