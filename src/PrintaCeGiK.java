
public class PrintaCeGiK {
	
	public static void main(String[] args) {
		
		int ch = 97;
		
		int count = 1;
		
		while(ch <= 122) {
			
			if(count%2==0) {
				
				System.out.println(Character.toUpperCase((char)(ch)));
			}
			
			else
			{
				System.out.println((char)(ch));
			}
			
			count++;
			ch+= 2;
			
			
		}
	}

}
