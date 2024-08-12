import java.util.*;
public class EvenNumbersForLoop
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter from X : ");
	   
	   int x=sc.nextInt();
	   
	   System.out.println("Enter to Y : ");
	   
	   int y=sc.nextInt();
	   
	   for(int i =x;i<=y;i++)
	   {
	       if(i%2==0)
	       {
	           System.out.println(i);
	       }
	   
	   
	    
		
	}		
}
}