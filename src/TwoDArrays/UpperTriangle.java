package TwoDArrays;

import java.util.Scanner;

public class UpperTriangle {
	
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
		
		for(int row=0;row<n;row++){
		    
		   
		    for(int col=0;col<m;col++){
		    	if(row<col) {
		    		
		    		System.out.print(arr[row][col]+"");
		    		
		    	}
		    	else {
		    		System.out.print(0);
		    	}
		    }
		    
		    System.out.println();

}
}
}
