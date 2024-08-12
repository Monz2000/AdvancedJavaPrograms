import java.util.Scanner;

public class Pattern4WithNumbers {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    
	    int n =sc.nextInt();
	    
	    for(int r = 1 ; r<=n; r++) //rows
	    { 
	    //for( int c = r; c > 0 ; c--) //columns can also use this for stars
	    	
	       for(int c = 1;c<=r;c++)    
	       {
	        System.out.print(c); // for numbers and stars
	    }
	      System.out.println();
	    }
	   
	} 

}