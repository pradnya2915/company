package starpattern;

public class Pradnya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for(int i=1;i<=7;i++) {
	   for(int j=6;j>=i;j--) {
		   if(i==1||i==5||i==3||i==2||i==6) {
			   System.out.print(i);
		   }else {
				  System.out.print(j); 
			   }
		  // System.out.print(j);
	   }
		  System.out.println(); 
   }
	}

}
