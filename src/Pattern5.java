import java.util.Scanner;
public class Pattern5 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int r = n;r>0;r--) {
			
			for(int c = r;c>0;c--) {
				
				System.out.print("*");
			}
			
			System.out.print('\n');
		}
	}
}

