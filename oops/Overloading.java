package oops;

public class Overloading 
{
	public void m(int i) 
	{
		System.out.println("value  "+i);
	}
	public void m(String a)
	{
		System.out.println("value  "+a);
	}
	public static void main(String[] args) 
	{
		Overloading o=new Overloading();
		o.m(123);
		o.m("hii");

	}

}


