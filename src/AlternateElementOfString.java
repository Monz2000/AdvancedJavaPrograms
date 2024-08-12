import java.util.*;
import java.lang.*;
public class AlternateElementOfString {
	public static void main( String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine();
		
		for( int i =1; i<= s.length(); i = i+2) {
			
			System.out.println(s.charAt(i-1));
		}
	}

}
