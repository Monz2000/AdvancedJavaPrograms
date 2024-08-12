package Arrays;

import java.util.Scanner;

public class FindTheLastIndexOfTheKey {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // getting how many arrays to be created
		
		int[] arr = new int[n]; // Declaring array variable and assigning to n arrays we need
		
		for(int i =0;i<n;i++) { //looping for n number of arrays
			
			arr[i]=sc.nextInt(); // inputting n number of  user inputs
			
	} 
		
		int key = sc.nextInt();
		
		int idx = -1;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key) {
				
				idx = i;
				
			}
			
			}
		System.out.println(idx);
		}

}
