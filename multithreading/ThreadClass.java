package multithreading;
class FristThread extends Threads1
{
	 public synchronized void run()
	{
		int i;
		
		for (i=0;i<=10;i++)
		{
		System.out.println(i+"hii ");
		
		//for (int j=1;j<=10;j++)
		
		//System.out.println(j+"hello");
		}
	//synchronized(this)
		
	
	//}
		
}
}
public class ThreadClass 
{
	 

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       FristThread f= new FristThread();
       FristThread f1= new FristThread();
       FristThread f2= new FristThread();
      
       f.start();
       try
       {
      f.sleep(5000);
       }
       catch(Exception e)
       {}
     
      f1.start();
      
       f2.start(); 
       //System.out.println();
       
	}
}


