import java.util.*;
public class UsingFunctionBasic {
	//modulus function
	public static int modulus(int x) {
		if(x<0) {
			x=x*-1;
		}
		
		return x;
	}
	//add function
	public static int add(int y) {
		
		
		y=y+3;
		
		
		return y;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println(modulus(num));
		System.out.println(add(num));
		
	}

}
