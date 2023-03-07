package importantprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Year:");
       int year=sc.nextInt();
       //int year=2000;
       if((year%400==0)||((year%4==0) &&(year%100!=0)))
       {
    	   System.out.println("is a leap year");
       }
       else{
       System.out.println("is not leap year");
       
       }
	}
}

