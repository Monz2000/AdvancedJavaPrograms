package Arrays;

import java.util.Scanner;

public class CountIndexValueElement {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {  //arranging 5 position
			
			arr[i] = sc.nextInt(); 
          }
		int cnt = 0;
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]==i) {
				
				cnt++;
			}
			
			System.out.println(cnt);
		}
}
}