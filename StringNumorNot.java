
public class StringNumorNot {

	public static void main(String[] args) {
		String input1 = "1234";
       
 
        try {
            // checking valid integer using parseInt()
            // method
            Integer.parseInt(input1);
            System.out.println( input1 + " is a valid integer number");
        }
        catch (NumberFormatException e) {
            System.out.println(input1 + " is not a valid integer number");
        }
 
	}
}



