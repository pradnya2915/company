package oops;

class Heritance 
{ 
	String name;
	public void h()
	{
		System.out.println("hii");
		
	}
}

public class Inheritance extends Heritance  
{
	public void m()
	{
		System.out.println("hello  " +name);
	}

	public static void main(String[] args) 
	{
		Inheritance i=new Inheritance();
		i.name="pradnya";
		i.h();
		i.m();
		
       System.out.println("welcome");
	}

}
