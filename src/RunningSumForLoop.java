import java.util.*;
import java.lang.*;
public class RunningSumForLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt(),sum = 0;
	
	int num=sc.nextInt();
	
	for(int i = 1; i <=n ;i++) {
		
		
		
		sum = sum+num;
		
		System.out.println(sum);
		
		
	}
	sc.close();
}
}

