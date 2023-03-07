package multithreading;  //method Synchronized
class Bank
{
	public synchronized void m()
	{   int i;
		for (i=0;i<=12;i++)
		{
		System.out.println(i);	
		}
	}
}
public class Synchronization extends Threads1
{    
	Bank b=new Bank();
	
	public void run ()
	{
	b.m();	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Synchronization s=new Synchronization();
         Synchronization s1=new Synchronization();
         s.start();
         s1.start();
	}

}
