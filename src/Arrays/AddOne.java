package Arrays;

import java.util.Scanner;

public class AddOne {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr[i] = sc.nextInt(); 
          }
		
		int carry = 1;
		
		for(int i = n-1;i>=0;i--) {
			
			int result =carry=arr[i];
			
			arr[i]=result%10;
			
			carry=result/10;
		}
		
		if(carry!=0) {
			System.out.print(carry+" ");
		}
		
		for(int i =0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}

}
}
