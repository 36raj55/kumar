import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r,n,temp,sum=0;
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter a number");
		 n=s.nextInt();
		 temp=n;
		 while(n!=0) {
			 r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
			 if(temp==sum) {
				 System.out.println("palindrome number");
			 }
				 else 
					 System.out.println("no a palindrome number");
			 }
		 }
		 
}
	


