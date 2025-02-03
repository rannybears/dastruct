package Rago;

import java.util.Arrays;

public class ExerciseArray {
    public static void main(String[] args) {

        Integer[] numbers = {4, 2, 5, 1, 0, 8, 7, 6, 3, 9};
        for (int x = 0; x < numbers.length; x++) {
        }

        //Max number
        	int max = numbers[0];
        	for (int x = 0; x < numbers.length; x++) {
        		if (numbers[x] > max) max = numbers[x];
        	}
        	System.out.println("Largest is " + max);

        //Min number	
        	int min = numbers[0];
        	for (int x = 0; x < numbers.length; x++) {
        		if (numbers[x] < min) min = numbers[x];
        	}
        	System.out.println("Smallest is " + min);
        
        //Total number
        	int total = 0;
        	for(int x = 0; x < numbers.length; x++) {
        		total += numbers[x];
        	}
        	
        	System.out.println("Total is " + total);
        	
        //Ascending Order 
    		for (int i = 0; i < numbers.length; i++) {
    			for (int j = i + 1; j < numbers.length; j++) {
    				if(numbers[i] > numbers[j]) {
    					int temp = numbers[i];
    					numbers[i] = numbers [j];
    					numbers[j] = temp;
    				}
    			}
    		}
    		
    		System.out.println("Ascending order: ");
    		for (int i = 0; i < numbers.length; i++) {
    			System.out.print(numbers[i] + " ");
    		}
        
    	//Descending Order
    		for (int i = 0; i < numbers.length; i++) {
    			for (int j = i + 1; j < numbers.length; j++) {
    				if(numbers[i] < numbers[j]) {
    					int temp = numbers[i];
    					numbers[i] = numbers [j];
    					numbers[j] = temp;
    				}
    			}
    		}
    		
    		System.out.println("\nDescending order: ");
    		for (int i = 0; i < numbers.length; i++) {
    			System.out.print(numbers[i] + " ");
    		}
    	//Average Number
    		System.out.println("");
    		float average = (float) total / numbers.length;
    		System.out.println("Average is " + average);
    		
    }
}
