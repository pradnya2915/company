package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet ls=new LinkedHashSet();
ls.hashCode();
ls.add("12");
ls.add("ASD");
ls.add("456");
ls.add("pradnya");
ls.isEmpty();
ls.remove(2);
System.out.println(ls);
Iterator e=ls.iterator();
while(e.hasNext()) {
	System.out.println(e.next());
}

	}

}
