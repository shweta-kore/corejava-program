package ANP_D0453;

/*
 * 
 * Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]
 */

import java.util.Arrays;
import java.util.Collections;

public class Arraysort {

	public static void main(String[] args) {
		String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(letters));

        // Sort the array in descending order
        Arrays.sort(letters, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted array (descending order): " + Arrays.toString(letters));

	}

}


//output

/*

*Original array: [A, X, D, Z, Y, C, W, B]
Sorted array (descending order): [Z, Y, X, W, D, C, B, A]
**
*/

