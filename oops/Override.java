package oops;
class AWE
{
	public void m(String a)
	{
		System.out.println(" hii  "  + a);
	}
}
public class Override extends AWE 
{
	
	public void m(String a) 
	{
		super. m(a);
		System.out.println("hello  " + a );
	}



	public static void main(String[] args)
	{
       
		Override o= new Override();
	    o.m("pradnya");

	}

}
