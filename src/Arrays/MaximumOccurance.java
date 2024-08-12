package Arrays;

import java.util.Scanner;

public class MaximumOccurance {
	
	public static int getFrequency(int[] arr,int num) {
		
		int cnt =0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==num) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static int getMostFrequentElement(int[] arr) {
		
		int ansNum=arr[0],ansFreq=1;
		System.out.println("Initially ans is :" +ansNum +""+" occuring" +ansFreq+"" + "times");
		for(int i=0;i<arr.length;i++) {
			System.out.println("---------------------------");
			System.out.println("Currently checking the number:"+arr[i]);
			int CandidateFreq = getFrequency(arr,arr[i]);
			System.out.println("frequency of the number is:"+CandidateFreq);
			System.out.println("now checking current ans freq is greater than current number freq or not");
			if(ansFreq<CandidateFreq) {
				
				System.out.println("we found a new numb which is occuring max numb of times....Updating the numb ansFreq and ansNumb to it");
				
				ansNum=arr[i];
				ansFreq=CandidateFreq;
			}
		}
		System.out.println("Finally returning ansNumb as:"+ansNum+""+"occuring"+ansFreq+""+"times");
		return ansNum;
	}
	
	public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  
		  int n=sc.nextInt();
		  
		  int[] arr= new int[n];
		  
		  for(int i =0;i<n;i++) {
			  
			  arr[i] = sc.nextInt();
		  }
		  
   System.out.println(getMostFrequentElement(arr));
}
}
