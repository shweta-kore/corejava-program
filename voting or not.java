package ANP_D0453;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input age of the candidate
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the candidate is eligible for voting
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
            System.out.println("You need to wait " + (18 - age) + " more year(s) to become eligible.");
        }

	}

}


/*


*Enter your age: 21
You are eligible to vote.

*/