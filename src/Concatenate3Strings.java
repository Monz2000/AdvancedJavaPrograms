import java.util.*;
import java.lang.*;
public class Concatenate3Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		
		String s2 = sc.nextLine();
		
		String s3 = sc.nextLine();
		
		String str = s1+s2+s3;
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(2));
	}

}
