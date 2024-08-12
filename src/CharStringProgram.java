import java.util.*;
import java.lang.*;
public class CharStringProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String s = sc.next() ;
		System.out.println("Enter the position: ");
		int i=sc.nextInt();
		
		
		
		System.out.println(s.charAt(i));
	}

}
