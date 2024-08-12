package TwoDArrays;

import java.util.Scanner;

public class ColumnWiseWithCondition {
	
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
		for(int col=0;col<m;col++){
			
		if(col%2==0) {
			
		
		for(int row=0;row<n;row++){
			System.out.print(arr[row][col]+" ");
		}
		} 
		else {
			for(int row=n-1;row>-1;row--){
				System.out.print(arr[row][col]+" ");
		}
		   
		}
		System.out.println();
		}
}

}
