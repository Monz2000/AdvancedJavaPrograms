import java.util.*;
 public class NCRFactorialwithFunc
{
    
	public static int Fact(int num) {
		
		int fact =1;
		
		//int n;
		for(int i = num; i>0 ;i--) {
			
			fact=fact*i;
			
		
		}
	
		return fact;
		
		
	}
	
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    
	    int n =sc.nextInt(),r=sc.nextInt(),C;
	    
	     int nf=Fact(n);
	     int nrf=Fact(n-r);
	     int fr = Fact(r);
	     
	     C = nf/(nrf*fr);
	    
	    System.out.println(C);
	    
	}    
	    
	}



