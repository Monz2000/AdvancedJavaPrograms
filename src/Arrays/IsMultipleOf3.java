package Arrays;

import java.util.Scanner;

public class IsMultipleOf3 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr[i] = sc.nextInt(); //taking user input values for the positions
			
		}
		
		for(int j = 0;j<n;j+=3){
			// need to print output of what user has given,taking those 5 value
			
			//if(j%3==0) {
			System.out.print(arr[j] + " "); //printing user input values
			
		//}
		}

}
}