package ANP_D0453;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		 al.add("Pallavi");
		 al.add("Pratibha");
		 al.add("Bhavna");
		 al.add("Shweta");
		 al.add(null);
		 al.add(null);
		 Iterator<String> itr=al.iterator();
		 while(itr.hasNext()){
		System.out.println(itr.next());

	}

}
}