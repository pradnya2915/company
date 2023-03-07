package controlstatement;

import java.util.Scanner;

public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
  System.out.println("Enter the value");
  int i=sc.nextInt();
  if( i<=35 ) {
	 System.out.println("fail"); 
  } else if (i>=40 &&i<50) {
	  System.out.println("D grade");
  }else if (i>=50 && i<60) {
	  System.out.println("b grade");
  }else if (i>=60 && i<80) {
	  System.out.println("a grade");
	 }
  }
}


