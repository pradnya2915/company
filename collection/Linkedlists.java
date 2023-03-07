package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlists {

	public static void main(String[] args) 
	{
     LinkedList ll= new LinkedList();
     ll.add("pradnya");
     ll.add(123);
     ll.add(null);
     ll.add('d');
     ll.remove(3);
     System.out.println(ll);
     Iterator i=ll.iterator();
     while(i.hasNext());
     {
    	 System.out.println(i.next());
    	 
     }
     
     

	}
}