package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Demo
{
int id;
String name;
  
 public Demo(int id,String name)
{
	this.id=id;
	this.name=name;
}
}
public class Arraylist1 
{
    public static void main(String[] args) 
    {
      Demo d=new Demo(123,"pradnya");
      Demo d1=new Demo(345,"bhor");
      Demo d2=new Demo(567,"ABC");
      ArrayList al=new ArrayList();
      al.add(d);
      al.add(al);
      al.add(d2);
      Iterator e=al.iterator();
      while(e.hasNext());
      {   // Demo = (Demo)e.next();
      
    	  System.out.println(e.next());
    	  System.out.println("thanks");
      }
      
	}

}
