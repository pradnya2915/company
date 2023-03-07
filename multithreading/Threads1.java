package multithreading;

public class Threads1 extends Thread {
	public void run()
	{
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Threads1 h=new Threads1();
		h.start();
		Threads1 h1=new Threads1();
		h1.start();

		Threads1 h2=new Threads1();
		h2.start();

      
	}

}
