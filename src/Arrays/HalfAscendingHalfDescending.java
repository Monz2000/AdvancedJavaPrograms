package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class HalfAscendingHalfDescending {
	
	public static void sortDescending(int[] arr,int x,int y) {
		
		for(int i =x;i<y;i++) {
			for(int j=x;j<y;j++) {
				
				if(arr[j]<arr[j+1]) {
					
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i =0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		sortDescending(arr,n/2,n-1);
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
