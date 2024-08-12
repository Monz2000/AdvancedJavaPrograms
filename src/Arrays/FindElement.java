package Arrays;
import java.util.*;
public class FindElement {
	// 1st method
	public static boolean arrayContains( int[] arr, int n,int target) {
		
		for(int i=0;i<n;i++){
			
			if(arr[i]==target) {
				
				return true;
			}
			
		}
		
		return false;
	}
	//second method
public static String arrayContains2( int[] arr, int n,int target) {
		
		for(int i=0;i<n;i++){
			
			if(arr[i]==target) {
				
				return "True";
			}
			
		}
		
		return "False";
	}

// 3rd method

public static void arrayContains3( int[] arr, int n,int target) {
	
	String ans = "false";
	
	for(int i=0;i<n;i++){
		
		if(arr[i]==target) {
			
			ans = "true";
		}
		
	}
	
	System.out.println(ans);
}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // getting how many arrays to be created
		
		int[] arr = new int[n]; // Declaring array variable and assigning to n arrays we need
		
		for(int i =0;i<n;i++) { //looping for n number of arrays
			
			arr[i]=sc.nextInt(); // inputting n number of  user inputs
			
	} 
		
		int target =sc.nextInt();// inorder to find the specific array element is present or not , giving target variable for the specific element
		
		// creatig boolean func
		
		//1st method
		
		/*if(arrayContains(arr,n,target)) { ** these are for capital T for true or false,
			
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}*/
		
		// instead of the above step , u can create the func with string like arraycontains2, both func works , but first func need the above steps, string func doesnt need it.
		
		//2nd method ,see below for arraycontains 2
		
		//System.out.println(arrayContains2(arr,n,target));
		
		//3rd method
		
		arrayContains3(arr,n,target);
		
		
		
		
	}

}
