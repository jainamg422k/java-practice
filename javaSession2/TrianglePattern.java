package javaSession2;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		  int n = sc.nextInt();
		  int row = 1;
		  int nsp = n-1;
        int nst = 1;				  
		  while(row<=n){
			  int csp =1;
			  while(csp <= nsp) {
				  System.out.print(" ");
				  csp++;
			  }
			  int cst = 1;
			  while(cst <= nst) {
				  System.out.print("*");
				  cst++;
			  }
			  nsp--;
			  nst+=2; 
			  System.out.println( );
			  row++;
		  }
			  
			  
			 
			  
	}

}
