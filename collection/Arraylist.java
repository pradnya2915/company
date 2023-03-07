package collection;
import  java.util.*;
public class Arraylist {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("pradnya");
		al.add("star");
		al.add(123);
		al.remove(1);
		System.out.println(al);
		Iterator e=al.iterator();
		while (e.hasNext());
		{
			System.out.println(e.next());
		}
		
		}

}
