package ANP_D0453;

class Example {
	// Method 1: A method to be called
	void displayMessage() {
		System.out.println("Hello, this is a method call using the 'this' keyword!");
	}

	// Method 2: Calls another method using 'this'
	void invokeMethod() {
		System.out.println("Calling displayMessage() from invokeMethod:");
		this.displayMessage(); // Using 'this' to call the current class method
	}
}

public class Main {
	public static void main(String[] args) {
		// Create an object of the Example class
		Example example = new Example();

		// Call the invokeMethod
		example.invokeMethod();
	}
}
//OUTPUT
/*

*Calling displayMessage() from invokeMethod:
	Hello, this is a method call using the 'this' keyword!
	
*/   