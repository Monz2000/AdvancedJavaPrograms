import java.util.*;
public class Print_n_n_k_n_2k {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int I = sc.nextInt();
		for(int j = n; j>=I; j=j-k)
		{
			System.out.println(j);
		}
	}

}
