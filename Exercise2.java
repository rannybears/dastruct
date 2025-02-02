package Rago;

import java.util.Arrays;
import java.util.Collections;

public class Exercise2 {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int smallest = numbers[0];
        int largest = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
            sum += num;
        }


        double average = (double) sum / numbers.length;
        
        System.out.println("Largest Value: " + largest);
        System.out.println("Smallest Value: " + smallest);
        System.out.println("Sum of Elements: " + sum);
        Arrays.sort(numbers);
        System.out.println("Ascending Order: " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(numbers));
        System.out.println("Average: " + average);
    }
}