package Arrays;

import java.util.Scanner;

public class PrintFirstVowelOcurance {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char[] arr = new char[n];
		
		for(int i = 0;i<n;i++)
		
		{
			arr[i]=sc.next().charAt(0);
		}
		
		for(int i = 0;i<n;i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='0'||arr[i]=='u')
					{
				
				System.out.println(i);
				break;
			}
		}
		
		
	}

}
