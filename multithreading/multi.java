package multithreading;

class multi1 {
	
	public void m1() {
		for (int j = 6; j<= 10; j++) {
			System.out.println(j);
		}
	}
	synchronized  public void m() {
		for (int i = 0; i <= 5; i++) 
		{
			System.out.println(i +"  SYNCH");
		}	//for (int h=1;h<=i;h++) {
				//System.out.println(h);
			//}
		
	}
	public void m2() {
		for (int k = 11; k <= 15; k++) {
			System.out.println(k);
		}
	}
	public void m3() {
		for (int l = 16; l<= 20; l++) {
			System.out.println(l);
		}
	}

}

public class multi extends Threads1 {
	multi1 mm = new multi1();

	public void run() {
		mm.m();
		mm.m1();
		mm.m2();
		mm.m3();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi R = new multi();
		R.start();
		multi R1 = new multi();
		R1.start();
		multi R2 = new multi();
		R2.start();
		multi R3 = new multi();
		R3.start();
		multi R4 = new multi();
		R4.start();
	}

}
