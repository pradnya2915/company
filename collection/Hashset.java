package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set s=new HashSet();
   s.add(123);
   s.add("pradnya");
   System.out.println(s);
   Iterator e=s.iterator();
   while ( e.hasNext()) {
	   System.out.println(e.next());
	   
   }
	}

}
