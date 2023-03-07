package controlstatement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter the Operator(+,-,*,/)");
		char op=sc.next().charAt(0);
		
		int o;
		switch(op)
		{
		case '+':
			o=num1+num2;
			System.out.println(o);
			//break;	
			
		case'-':
			o=num1-num2;
			System.out.println(o);
			//break;
		case'*':
			o=num1*num2;
			System.out.println(o);
			//break;
		case'/':
			o=num1/num2;
			System.out.println(o);
			break;
		
			default:
				System.out.println("getting input is wrong");
				break;
		}
	}

}
