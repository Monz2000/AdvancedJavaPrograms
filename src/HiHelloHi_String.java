import java.util.*;
public class HiHelloHi_String {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String 1: ");
		
		String a = sc.nextLine();
		
		System.out.println("Enter String 2: ");
		
		String b = sc.nextLine();
		
		if(a.length()<b.length()) {
			
			System.out.println(a+b+a);
		}
		else
		{
			System.out.println(b+a+b);
		}
		
	}
}
