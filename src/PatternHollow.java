import java.util.*;
public class PatternHollow {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hz = sc.nextInt();
		int ver =sc.nextInt();
		
		for(int r=1;r<=ver;r++) {
			
			if(r==1||r==ver) { //if(r==0||r==ver) to ignore the top...one kind of pattern
				
				for(int c =0;c<=ver;c++) { //for(int c=0;c<=r;c++)
					
					System.out.print("*");
				}
				
			}
			else {
				System.out.print('*');
				
				for(int c=0;c<hz-2;c++) {
					System.out.print(" ");
				}
	            
				System.out.print('*');
			}
			
			System.out.println();
			
		}
	}

}

