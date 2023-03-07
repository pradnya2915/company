package multithreading;
 class Badhoda 
 {
	 synchronized static void k()
	 {
		 int i;
		 
		 for(i=1;i<=12;i++)
		 {
			System.out.println(i);
			for (int j=1;j<=i;j++)
			{
			System.out.println(j);	
			}
		 }
	 }
 }
public class StaticSynchronized extends Threads1 
{
	Badhoda b=new Badhoda();
	public void run()
	{
		b.k();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSynchronized s=new StaticSynchronized();
		s.start();
		
	}

}
