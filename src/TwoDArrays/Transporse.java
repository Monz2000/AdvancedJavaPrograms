package TwoDArrays;

import java.util.Scanner;

public class Transporse {

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
		for(int i=0;i<n;i++){
		    
			   
		    for(int j=0;j<m;j++){
		        
		        System.out.print(arr[j][i]+" ");
	}
		    System.out.println();
}
}
		
}
