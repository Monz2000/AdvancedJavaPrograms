package Arrays;

import java.util.Scanner;

public class CheckCharacteristic {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr[i] = sc.nextInt(); 
          }
		
		for(int i =0;i<n;i++) {
			
			if(arr[i]>0) {
				arr[i]=1;
			}
			else if(arr[i]==0){
				
				arr[i]=0;
			}
             else if(arr[i]<0){
				
				arr[i]=-1;
			}
		}
			for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
			}
		}
}
