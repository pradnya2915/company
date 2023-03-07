package collection;

import java.util.Iterator;
import java.util.LinkedList;

class Demo1
{
    int id;
    String name;
public Demo1(int i,String name)
{ 
	this.id=id;
	this.name=name;
}
			
}
public class Linkedlist1
{
	public static void main(String[] args)
	{
		Demo1 d=new Demo1(1234,"pradnya");
		Demo1 d1=new Demo1(567,"bhor");
		LinkedList ll=new LinkedList();
		ll.add(d);
		ll.add(d1);
		
		Iterator i=ll.iterator();
		while(i.hasNext())
		{
			//Demo1=(Demo1)i.next();
			
		
		
		System.out.println(i.next());
}
	}
		

	}


