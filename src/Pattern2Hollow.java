import java.util.Scanner;
public class Pattern2Hollow {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int ver =sc.nextInt();
		
		for(int r=1;r<=ver;r++) {
			
			if(r==ver) { //if(r==0||r==ver) to ignore the top...one kind of pattern
				
				for(int c =0;c<ver;c++) { //for(int c=0;c<=r;c++)
					
					System.out.print("*");
				}
				
			}
			else {
				System.out.print('*');
				
				for(int c=0;c<ver-2;c++) {
					System.out.print(" ");
				}
	            
				System.out.print('*');
			}
			
			System.out.println();
			
		}
	}

}
