package ANP_D0453;

import java.util.Stack;

public class TestJavaCollection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> s=new Stack<Integer>();// creating stack object
		System.out.println("Stack is empty or not=>"+s.empty());
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println("Stack element=>"+s);
		System.out.println("Stack is empty or not=>"+s.empty());
		System.out.println("Pop Element=>"+s.pop());
		System.out.println("Pop Element=>"+s.peek());
		System.out.println("Stack element=>"+s.size());
		System.out.println("Stack element=>"+s.search(50));

	}

}
