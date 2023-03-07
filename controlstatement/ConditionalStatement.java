package controlstatement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		int a, b;
		System.out.println("enter the value a");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("enter the value b ");
		b = sc.nextInt();

		if (a > b) {
			System.out.println(a + " is greater than  " + b);
		}else if(a==b){
			System.out.println(a+" is equal to "+b);
		}else {
			System.out.println(a + " is less than " + b);
		}
	}
}
