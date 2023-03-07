package exception;

import java.util.Scanner;

public class TryBlock {

	public static void main(String[] args) {
	
		try
		{
			Scanner sc=new Scanner(System.in);
			   System.out.println("Enter the value");
			   System.out.println("Enter the first value");
		    int First=sc.nextInt();
			   System.out.println("Enter the second value");
			int second=sc.nextInt();
			int results= First/second;
		       System.out.println("results: "+results);
      		       
		}
		catch (Exception e) 
		{
			System.out.println("Exception occured");
			
		}
	
       finally
       {
    	   System.out.println("thank you");
       }
	}

}
