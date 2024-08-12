
public class PrintaBcDeF_ForLoop {
	public static void main(String[] args) {
		
		for(Character ch = 'a' ; ch<='z' ; ch++) {
			
			if(ch%2==0) {
				
				System.out.print(Character.toUpperCase(ch) + " ");
				}
			
			else 
			{
			System.out.print(ch + " ");
			}
			
		}
			
	}

}
