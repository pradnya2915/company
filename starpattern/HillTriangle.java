package starpattern;

public class HillTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for(int i=1;i<=5;i++) {
	  int p=1;
	  for(int j=i;j<=5;j++) {
		  System.out.print(" ");
		  
	  }
	  for(int j=1;j<i;j++) {
		  System.out.print(p+++"");
		  
	  }
	  for(int j=1;j<=i;j++) {
		  System.out.print(p--+"");
		  
	  }
	  System.out.println();
  }
	}

}
