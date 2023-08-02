package corejava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	  System.out.println("enter a number to the reverse");
	  int n = s.nextInt();
	  int reverse= 0;
	  while(n!=0) {
		  int digit = n%10;
		  reverse= reverse*10+digit;
		  n=n/10;
	  }
	  System.out.println("reverse number="+reverse);
		  
	  }

	
	}


