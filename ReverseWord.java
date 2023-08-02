import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		String input;
		String[] Words;
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a sentance");
		input = scanner.nextLine();
		Words = input.split("");
		System.out.println("reversed sentance");
		for(i=Words.length -1;i>=0;i--){
			System.out.println(Words[i] + "");
                                          
	
}
		
		

	}

}
