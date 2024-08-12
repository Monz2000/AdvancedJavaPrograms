package TwoDArrays;

import java.util.*;

public class InterchangeTheRow {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			int m = sc.nextInt();
			
			int[][] arr=new int[n][m];
			
			for(int row =0;row<n;row++) {
				
				for(int col =0;col<m;col++) {
					
					arr[row][col]=sc.nextInt();
			}
			}
				     
				for(int row=0;row<n;row++) {
					
					
						//swapping  (0,0 )- (0,n-1) th row and (1,0) - (1,n-1) row
						int temp=arr[0][row];
						arr[0][row]=arr[n-1][row];
						arr[n-1][row]=temp;
						
					}
				
				for(int row =0;row<n;row++) {
					
					for(int col =0;col<m;col++) {
						
						System.out.print(arr[row][col]+" ");
				}
					
					System.out.println();
			
			
		}
	}

}
