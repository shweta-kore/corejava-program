package ANP_D0453;	

/*
 * 
 * Write a Java program to sort in ascending order 
 * an array of given integers[45,35,56,67,78,89,78,12,20]
 */

import java.util.Arrays;

public class Arrayclass {

	public static void main(String[] args) {
		
		        // Define the array of integers
		        int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};

		        // Print the original array
		        System.out.println("Original array: " + Arrays.toString(numbers));

		        // Sort the array in ascending order
		        Arrays.sort(numbers);

		        // Print the sorted array
		        System.out.println("Sorted array (ascending order): " + Arrays.toString(numbers));
		    


	}

}

//output
/*

*Original array: [45, 35, 56, 67, 78, 89, 78, 12, 20]
Sorted array (ascending order): [12, 20, 35, 45, 56, 67, 78, 78, 89]

*

*/
