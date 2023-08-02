import java.util.Scanner;

public class CenturyYearorNot {

public static void main(String[] args) {	
Scanner sc=new Scanner(System.in);
System.out.println("check a leap year,century year or not");
System.out.println("=enter a year");
int year=sc.nextInt();
if(year%100==0) {
if(year%400==0) {
	System.out.println("Year '"+year+"' is a Century Year and a Leap Year!");
} else {
	System.out.println("Year '"+year+"' is a Century Year but not a Leap Year!");
}
            	   
}
              
else {
            	   
if(year%4==0) {
	System.out.println("Year '"+year+"' is not a Leap Year!");
}
}
               
} 	  
}
	
	


