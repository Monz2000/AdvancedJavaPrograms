import java.util.*;
public class FactorialFuntion {
	
	public static int Fact(int num) {
		
		int fact =1;
		
		//int n;
		for(int i = num;i>0;i--) {
			
			fact=fact*i;
			
		
		}
		
		return fact;
		
		
		
	}
	
	
}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);            
		
		int num = sc.nextInt();
		
		for(int i =0;i<num;i++)// printing input num times
		
		System.out.println(Fact(sc.nextInt()));//print each different input and its respective output
		
	}
	

}
