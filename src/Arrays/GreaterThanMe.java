package Arrays;

import java.util.Scanner;

public class GreaterThanMe {

public static void getGreater(int[] arr) {
		
		for(int i = 0;i<arr.length;i++) {
			
			int cnt =0;
			
			for(int j = 0;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
				
				cnt++;
			}
		}
			
			System.out.println(cnt+" ");
	}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		getGreater(arr);
	}

}

