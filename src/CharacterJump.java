import java.util.*;
public class CharacterJump {
	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 
			System.out.println("Enter the character : ");
			
			Character ch= sc.next().charAt(0);
			
			if(ch>='a'&& ch<='z') {
				
				if(ch>='a' && ch<='w') {
					
					System.out.println((char)(ch+3));
					
				}
				else {
					System.out.println("couldnt jump");
				}
				
			}
			else {
				System.out.println("Not a lowercase");
				}
		}
	}


