package TwoDArrays;

import java.util.Scanner;

public class CompareTwoMatrix {

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
		boolean ans = true;
		//checking shape is equal or no
		if(n1!=n2||m1!=m2) {
			ans=false;
		}
		//now we know n1==n2 and m1==m2 ,start traversal
		else {
			for(int i=0;i<n1;i++) { //can be n1 or n2 bcs both are eql
				for(int j =0;j<m1;j++) {
					if(arr1[i][j]!=arr2[i][j]) {
						ans=false;
					}
				}
			}
		}
		if(ans) {
			System.out.print("same");
		}
		else {
			System.out.print(" not same");
		}
		}
		
}
