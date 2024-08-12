package TwoDArrays;

public class BasicArray {
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		int[][] arr=new int[5][5];
		
		arr[0][1]=25;
		
		System.out.println(arr[0][1]);
	}

}

// basic inputting an array

/*
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int[][] arr=new int[x][y];
		
		for(int i=0;i<x;i++){
		    for(int j=0;j<y;j++){
		        
		        arr[i][j]=sc.nextInt();		   
		        }
		}
		
		for(int i=0;i<x;i++){
		    
		    System.out.println("\n\narray no:"+(i+1));
		    for(int j=0;j<y;j++){
		        
		        System.out.print(arr[i][j]+" ");
	}
}
}
*/
