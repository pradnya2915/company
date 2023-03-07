package importantprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c,v,rem,arm=0;
Scanner sc=new Scanner (System.in);
System.out.println("enter the Armstrong number");
n=sc.nextInt();
c=sc.nextInt();
n=c;
while(n>0) {
	rem=n%10;
	arm=(rem*rem*rem)+arm;
	c=n/10;
}
//System.out.println(c);
if(c==arm) {
	System.out.println("Its a Armstrong number");
}
else {
	System.out.println("Its not a Armstrong");
}

String d=" ";
String s="dghgfhh   h4#$%%%^   FHGG@@#";
s=s.replaceAll(" ","");
System.out.println(s);

	}

}
