package oops;  //Abstract class
  abstract class ABC
{
	abstract void m();
	
	
	public void n() 
	{
		System.out.println("java");
		
	}
	
}
   class AbstractClass extends ABC
   {
	   void m()
	   {
		   System.out.println("fullstack");
	   }
	   
	public static void main(String[] args) 
	{
		AbstractClass o=new AbstractClass();
		o.n();
		o.m();
		System.out.println("development");
    }

}
