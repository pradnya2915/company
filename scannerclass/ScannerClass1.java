package scannerclass;

import java.util.Scanner;

public class ScannerClass1 
{

	public static void main(String[] args) 
	{
		String username;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the username");
		username=in.nextLine();

		System.out.println("my name is "+username );
		System.out.println("password is");
		int i=in.nextInt();
		System.out.println("password is: "+i);
		  
        int it1, it2;
        System.out.println("Enter 2 values ..");
        it1=in.nextInt();
        it2=in.nextInt();
        
        if(it1==34 && it2==12)
        {
        	System.out.println("condition is true");
        }
        	else
        {
        	System.out.println("condition is false");
         }
        
        // it=in.nextInt();
        //System.out.println("password is"+it);
        
        float u;
        
        System.out.println("enter the value");
        u=in.nextFloat();
        
        long n;
        
        System.out.println("enter the long value");
        n=in.nextLong();
        
        System.out.println("Enter a character");
        char h=in.next().charAt(0);
       
        
        //boolean f=in.hasNext();
       // System.out.println("enter");
        
        System.out.println("Values You Entered Are : "+it1+"  "+it2+"  "+u+" " +n+" "+h);
        
        
        
	}

}


