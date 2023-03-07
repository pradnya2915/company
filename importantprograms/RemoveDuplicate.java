package importantprograms;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List <String>l=new ArrayList<>();
		l.add("hii");
		l.add("hello");
		l.add("welcome");
		l.add("hii");
		Set <String> s= new LinkedHashSet<String>(l);
		System.out.println(s);
	}

}
