package multithreading;
class SecondThread implements Runnable
{
	public void run () 
	{
		int i;
		for (i=1;i<=11;i++) 
		{
			System.out.println(i);
			
		}
	}
}
public class RunnableInterface 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       SecondThread f=new SecondThread();
       Thread t=new Thread(f);
       t.start();
	}

}
