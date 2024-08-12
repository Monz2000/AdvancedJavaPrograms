import java.util.Scanner;
public class Pattern6 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int r = 0; r< n; r++) { //rows
			
			for(int s = 0 ; s <(n-r) ;s++) {//space
				
				System.out.print(" ");
			}
			
			for(int c= 0; c<r;c++) { //stars
				
				System.out.print('*');
			}
			
			System.out.println();
		}
	}
}


