package controlstatement;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int marks = sc.nextInt();
		// int marks =35;
		if (marks < 35) {
			System.out.println("fail");
			if (marks >= 35 && marks <= 40) {
				System.out.println("passed");
				if (marks >= 60 && marks <= 70) {
					System.out.println("first class");
					if (marks >= 70 && marks <= 80) {
						System.out.println("distiction");
					} else {
						System.out.println("not distiction");
					}
				} else {
					System.out.println("less than first class");
				}
			} else {
				System.out.println("not passed");

			}
		} else {
			System.out.println("not fail");
		}

	}
}
