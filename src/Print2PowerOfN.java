import java.util.*;
public class Print2PowerOfN {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int num = 1;
	    
	    for(int i=0;i<n;i++){
	        
	       num = num *2;
	        
	    }
	    
	    System.out.println(num);
	}

}
