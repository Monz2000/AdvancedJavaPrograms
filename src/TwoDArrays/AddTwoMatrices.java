package TwoDArrays;

import java.util.Scanner;

public class AddTwoMatrices {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter matrix 1 of n1 and m1:");
		int n1=sc.nextInt();
		int m1=sc.nextInt();
		
		System.out.println("Enter matrix 2 of n2 and m2:");
		int n2=sc.nextInt();
		int m2=sc.nextInt();
		
		int[][] arr1=new int[n1][m1];
		
		for(int i=0;i<n1;i++){
		    for(int j=0;j<m1;j++){
		        
		        arr1[i][j]=sc.nextInt();		   
		        }
		       }
       int[][] arr2=new int[n2][m2];
		
		for(int i=0;i<n2;i++){
		    for(int j=0;j<m2;j++){
		        
		        arr2[i][j]=sc.nextInt();		   
		        }
		       }
		
		if(n1!=n2||m1!=m2) { //shld be same size if not print -1
			System.out.println(-1);	
			}
		else {
			for(int i=0;i<n1;i++) { //can be n1 or n2 bcs both are eql
				for(int j =0;j<m1;j++) {
					
						System.out.print(arr1[i][j]+arr2[i][j]+" ");
					}
				
				System.out.println();
			}
		}
}
		}


