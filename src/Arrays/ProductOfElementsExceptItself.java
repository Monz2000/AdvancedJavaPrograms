package Arrays;

import java.util.Scanner;

public class ProductOfElementsExceptItself {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr[i] = sc.nextInt(); 
          }
		
		
			int product =1;
			
			for(int j =0;j<n;j++) {
				
				product *=arr[j];
			}
			
			for(int i=0;i<n;i++) {
				
				System.out.println(product/arr[i]); //for multiplication, except the current value is done by division
			}
			
			
			
			
		}
			

}


