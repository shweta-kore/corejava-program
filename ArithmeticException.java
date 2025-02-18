package ANP_D0453;

/*Write a program demonstrating  Exception handling using try catch for Arithmetic Exception.*/

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            // Trying to divide by zero, which will throw ArithmeticException
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // Catching the ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

/*Output
 * Error: Division by zero is not allowed.
 * Program continues after exception handling.
 * 
 * 
 */

  