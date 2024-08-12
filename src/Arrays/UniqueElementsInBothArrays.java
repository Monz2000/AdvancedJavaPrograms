package Arrays;

import java.util.Scanner;

public class UniqueElementsInBothArrays {
	
public static boolean Search(int[] arr, int key) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==key) {
				
				return true;
			}
		}
		return false;
}

public static int getFrequency(int[] arr,int num) {
	
	int cnt =0;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]==num) {
			cnt++;
		}
	}
	return cnt;
}
public static void PrintIntersection(int[] arr1, int[] arr2) {
	
	for(int i=0;i<arr1.length;i++) {
		
		if((getFrequency(arr1,arr1[i])==1)&&(Search(arr2,arr1[i]))) {
			
			System.out.print(arr1[i] + " ");
		}
	}
	
	
}
public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int n=sc.nextInt();
	  
	  int[] arr1= new int[n];
	  
	  for(int i =0;i<n;i++) {
		  
		  arr1[i] = sc.nextInt();
	  }
      int m=sc.nextInt();
	  
	  int[] arr2= new int[m];
	  
	  for(int i =0;i<m;i++) {
		  
		  arr2[i] = sc.nextInt();
	  }
	  
	  PrintIntersection(arr1,arr2);
}

}

