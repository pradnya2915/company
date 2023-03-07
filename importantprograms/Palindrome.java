package importantprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	/*	String s="nitin";
		String r=" " ;
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
			
			
		}
		System.out.println(r);		
       
		if (s.equals(r))
{
	System.out.println("is palindrome String");
}
	else
	{
		System.out.println("is not palindrome String");
	}*/

		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the value");
		int number[]=new int [] {123,34,54,67,567,121,323};
		
		for(int i=0;i<number.length;i++)
		{
		int num=number[i];
		int temp=0;
		int reverseNumber=0;
          while(num>0)
          {
        	  temp=num%10;
        	  num=num/10;
        	  reverseNumber=reverseNumber*10+temp;
          }
          if(number[i]==reverseNumber)
          
        	  System.out.println(number[i] +  " : is a palindrome");
          
          else 
        	  System.out.println(number[i] +  " : is not a palindrome");
          
		}
	
		
		
	}

}
