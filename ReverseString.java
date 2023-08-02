
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String OriginalStr = "Hello";
		String reversedStr = "";
		System.out.println("original string. " + OriginalStr);
		for(int i = 0; i < OriginalStr.length(); i++) {
			reversedStr = OriginalStr.charAt(i) + reversedStr;
		}
			System.out.println("ReversedString: "+ reversedStr);
		}
	}

