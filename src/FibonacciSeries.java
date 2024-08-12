import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int s = 1, r=0, sn,rn;
		
		for(int i = 1; i <= n; i++) {
			
			
			
			System.out.println(s);
			
			sn=r+s;
			rn=s;
			
			r=rn;
			s=sn;
	
		}
	}

}
