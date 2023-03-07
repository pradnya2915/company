package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TreeSet<Integer> t=new TreeSet();
  // t.add("hiii");
   t.add(123);

   t.add(34);
   t.add(897);
   t.add(678);
   t.add(56);
   int no=t.first();
   t.tailSet(34);
  // t.descendingIterator();
   System.out.println(" NO= "+no);
   System.out.println(t);
   Iterator i=t.iterator();
   while (i.hasNext()) {
	   System.out.println(i.next());
   }
	}

}
