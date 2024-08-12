import java.util.*;
public class MultipleForLoop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the multiple number n :");
		
		int n = sc.nextInt();
		
		for(int i = 0; i<=n*10 ; i+=n) {
			
			System.out.println(n + "x" + i/n + "=" + i);
		}
	}

}
