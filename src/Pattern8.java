import java.util.*;
public class Pattern8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r;
		for(  r = 1;r<=n;r++);
		
		{
			if(r%2==0) {
				
				System.out.print("*");
				
				for(int c = 0;c<n-1;c++) {
					
					System.out.print(" ");
					
				}
				System.out.print("*");
			}
			
			else {
				
				for(int c =0;c<n;c++) {
					
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
		
		
				
	}
	
	

}
