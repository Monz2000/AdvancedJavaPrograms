package Arrays;

import java.util.Scanner;

public class UpdateQuery2 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr[i] = sc.nextInt(); 
          }
		
		int left=sc.nextInt(),right=sc.nextInt(),x=sc.nextInt();
		
		/*for(int i =0;i<=left;i++) {
			
			arr[i]+=x;
		}
			
	    for(int i =right;i<n;i++) {
				
				arr[i]+=x;
			
		  }*/
	   
		for(int i =0;i<n;i++) { 
	  if(i<=left||i>=right){
	    
	   arr[i]+=x;
        }
	    
	    
		//for(int i =0;i<n;i++) {
		System.out.print(arr[i]+ " ");
		}
}


}
