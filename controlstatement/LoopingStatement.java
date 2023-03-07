package controlstatement;     //by using for loop

import java.util.Scanner;

public class LoopingStatement
{

	public static void main(String[] args)
	{
	 
	
	 int i;
	 int j;
	 for(i=0;i<=5;i++)
	 {
		 System.out.println("i block executed");
		 for(j=1;j<=i;j++)
		 {
			 System.out.println("j block is executed");
			 System.out.println(i);
			 System.out.println(j);
		 }
	 }
	}

}
