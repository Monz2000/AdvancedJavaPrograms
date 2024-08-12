package Arrays;

import java.util.Scanner;

public class PeakIndexMountainArray {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :");
		int n = sc.nextInt();
		
		
		int[] arr =new int[n];
		
		for(int i =0;i<n;i++) { 
			System.out.print("Enter arr[i] values of"+" "+i+":");
			arr[i]= sc.nextInt();
		}
		
/*int index = 0;
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]>=index) {
				
				index=i;
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("The peak index value is :"+ index + "and the array element is :"+arr[index]);
*/
for(int i =1;i<arr.length-1;i++) {
			
			if((arr[i-1]<arr[i])&&(arr[i+1]<arr[i])) {
				
				System.out.print(arr[i]+" ");	
				//break; //if print all the "array elements" ,shld not break and i to arr[i]
}
}
}
}