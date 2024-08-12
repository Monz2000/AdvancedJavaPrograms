import java.util.*;
public class PatternNumberMultiplyBy5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int j = sc.nextInt();
		
		for(int r = 1;r<n;r++) {
			
			for(int c = 1;c<=r; c++) {
				
				System.out.print(" " + c*j);
			}
			
			System.out.print('\n');
			
		}
	}

}
