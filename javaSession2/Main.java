package javaSession2;

import java.util.Scanner;


 
public class Main{
	public static void subArray(int arr[],int n) {
		int maxSum  = Integer.MIN_VALUE;
		for (int si = 0; si<  n ; si++) {
			int sum =0;
			for(int ei =si; ei < n;ei++ ) {
				 sum = sum +arr[ei];
				 if(sum>maxSum) {
					 maxSum = sum;
				 }
				 System.out.println(si + " "+ ei + "  " + sum);
				
 			}
		}
		System.out.println("maxsum sum "+ maxSum);
	}
	public static void main(String []args) {
		 int arr[] = {1,2,3,4,} ;
		 int n = arr.length;
		
		 subArray(arr,n);
	} 
}
	
		
	
		
		
	
	



	    	 
	         
	       
	   

	     
			
	     
			



		
			
		

