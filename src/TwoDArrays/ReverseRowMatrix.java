package TwoDArrays;

import java.util.Scanner;

public class ReverseRowMatrix {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[][] arr=new int[n][m];
		
		for(int row=0;row<n;row++){
		    for(int col=0;col<m;col++){
		        
		        arr[row][col]=sc.nextInt();		   
		        }
		}
		
		for(int row=0;row<n;row++) {
			
			for(int col=0;col<m/2;col++) {
				
				int temp = arr[row][col];
				
				arr[row][col]=arr[row][n-1-col];
				arr[row][n-1-col]=temp;
			}
		}
		
		for(int row = 0;row<n;row++) {
			for(int col =0;col<m;col++) {
				System.out.print(arr[row][col]+"");
			}
			
			System.out.println();
		}
}
		

}
