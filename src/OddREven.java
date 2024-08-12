import java.util.*;

public class OddREven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <=n ; i++) {
			
			int num=sc.nextInt();
		
		if(num%2==0) {
			
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}

}
}