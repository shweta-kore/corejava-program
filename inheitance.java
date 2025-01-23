package ANP_D0453;

class Person{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void speak() {
		System.out.println(name+" is speaking.");
	}
}
 class Student extends Person{
	 String grade;
	 
	 public Student(String name,int age,String grade) {
		 super(name,age);
		 this.grade=grade;
		 
	 }
	 public void study() {
		 System.out.println(name+ " is studying in grade" + grade+".");
	 }

}

public class InheritaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("shweta",20," s");
		student.speak();
		student.study();
		
}
}
//OUTPUT

/*

*shweta is speaking.
shweta is studying in grade s.

*/    