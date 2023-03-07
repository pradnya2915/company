package exception;
import java.util.Scanner;
class InsufficientFund extends Exception{
	public InsufficientFund(String s) {
		super(s);
	}
public class ABC{

		public static void main(String[] args) {
		// TODO Auto-generated method stub
  double totalbalance=2000;
    //double Withdrawl=200;
 double Withdrawl;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Withdrawl value");
     double balance =sc.nextDouble();
    try {
		double bal=totalbalance-balance;
    	if(totalbalance<balance) {
    		throw new InsufficientFund("insufficient fund");
    	}
    	else {
    		System.out.println("tansaction successfully");
    		totalbalance=totalbalance-balance;
    		System.out.println("remaning balance is:"+bal);
    	}
    }
    catch(Exception r) {
    	System.out.println(r.getMessage());
    	System.out.println("execute the problem");
    }
	}
}
}
 