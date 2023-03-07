package importantprograms;

import java.util.Scanner;

public class PerfectNumber
{

	public static void main(String[] args) 
	{
		int i,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		i=sc.nextInt();
		int j=1;
		
		while(j<=i/2)
		{
			if(i%j==0)
			{
				sum+=j;
			}
			j++;
			System.out.println(j);
			
		}
          if(sum==i)
          {
        	  System.out.println(i +": is a perfect number");
          
          } else
          {
        	  System.out.println(i +": is not perfect number");
          }
          
	}
}


