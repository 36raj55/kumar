package corejava;

public class SumArray {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
          int i;
        for(i=0; i < myArray.length;i++) {
        	sum += myArray[i];
        }
        System.out.println("the sum is:" + sum);
        	
        }
	

}
