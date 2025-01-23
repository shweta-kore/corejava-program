package ANP_D0453;

//Class representing a Student
class Student1 {
 String name;
 int age;
 Details details;

 // Constructor for the Student class
 Student1(String name, int age) {
     this.name = name;
     this.age = age;

     // Pass the current object (this) to the Details class constructor
     this.details = new Details(this);
 }

 // Method to display Student information
 void display() {
     System.out.println("Student Name: " + name);
     System.out.println("Student Age: " + age);
 }
}

//Class representing Details
class Details {
 // Constructor for the Details class
 Details(Student1 student1) {
     System.out.println("Details Constructor called with Student object.");
     // Call display() of the Student object passed as an argument
     student1.display();
 }
}

//main class
public class Constructor {

	public static void main(String[] args) {
		 // Create a Student object
        Student1 student = new Student1("Shwetuu", 20);
	

	}

}
//output
/*
*
*Details Constructor called with Student object.
Student Name: Shwetuu
Student Age: 20
*/