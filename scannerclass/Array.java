package scannerclass;

public class Array
{
   /*  int[] primes = {2,3,5,7,11} ;
     //looping over array using loop
     void  meth() {
     for (int i=0;i<primes.length; i++)
     {
    	 System.out.println(i);
     }
     }*/
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Array A= new Array();
      //A.meth();
		
		int a[]=new int [6];
		a[2]=23;
		a[1]=12;
		a[0]=24;
		a[3]=45;
		a[4]=34;
		a[5]=56;
		//System.out.println(a);
	//	for(int i=0; i<=a.length; i++) {
			for(int r:a) {
			System.out.println(r);
		}
		
	}

}
