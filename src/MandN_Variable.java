import java.util.*;
public class MandN_Variable
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    
	    int n=sc.nextInt(),m=sc.nextInt();
	    
	    
	    int a=0,b=0;
	    
	    while(n>0);
	    
	    {
	        
	        if(n%2==0){
	            n--;
	        }
	        else{
	            n-=3;
	        }
	        
	        a=a+1;
	    }
	    
	   
	    for(  ;m>0; b=b+1) {
	    	
	    	 if(m%2==0){
		            m--;
		        }
		        else{
		            m-=3;
		        }
	    	
	    }
	    
	    if(a<b){
	        System.out.println(a);
	        
	    }
	    
	    else{
	        
	        System.out.println(b);
	        
	    }
	}
}