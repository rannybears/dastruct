package dastruct;

public class TestArray {
	
	public static void main (String[]args) {
		double[] myArray = {1.9, 2.9, 3.4, 3.5};
		
		for (int x = 0;  x < myArray.length;x++) {
			System.out.println(myArray[x] + "");
			
		}
		
		double total = 0;
		for (int x= 0; x < myArray.length;x++) {
			total += myArray[x];
		}
		
		System.out.println("Total is " + total);
		
		double max = myArray[0];
		for (int x = 0; x < myArray.length;x++) {
			if (myArray[x] > max) max = myArray[x];
			
		}
		
		System.out.println("Max is " + max);
	}

}
