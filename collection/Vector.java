package collection;

import java.util.Iterator;
import java.util.Stack;

public class Vector {

	public static void main(String[] args) {
  
		Stack s=new Stack();
		s.push("pradnya");
		s.push(123);
		s.pop();
		s.peek();
		s.search("123");
		System.out.println(s);
		Iterator e=s.iterator();
		while (e.hasNext())
		{
			System.out.println(e.next());
		}
		
		
		
		
		

	}

}
