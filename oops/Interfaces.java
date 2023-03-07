package oops;
interface ASD
{
	void p(int i,int y);
		
}

public class Interfaces implements ASD 
{
    public void p(int i,int y)
    {
    	System.out.println("value  " +( i* y));
    }
    
	public static void main(String[] args) 
	{
		Interfaces i=new Interfaces();
		i.p(20, 30);
		
       //System.out.println(i);
	}

}
