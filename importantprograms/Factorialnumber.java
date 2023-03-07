package importantprograms;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int number=5;
  int factorial=number;
  for(int i=(number-1);i>1;i--) {
	  factorial=factorial*i;
  }
  System.out.println("factorial of a number is "+factorial);
  
	}

}
