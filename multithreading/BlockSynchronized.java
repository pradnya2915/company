package multithreading;

class SBI {
	public void n() {
		int i;
		int j;

		for (i = 1; i <= 19; i++) {
			for (j = 1; j <= i; j++) {

			}

			System.out.println(i);
		}
		System.out.println("abc");

		System.out.println("hii");
		System.out.println("hello");

	}
}

public class BlockSynchronized extends Threads1 {
	SBI v = new SBI();

	public void run() {
		v.n();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockSynchronized b = new BlockSynchronized();
		BlockSynchronized b1 = new BlockSynchronized();
		BlockSynchronized b2 = new BlockSynchronized();
		BlockSynchronized b3 = new BlockSynchronized();
		b.start();
		b1.start();
		b2.start();
		b3.start();

	}
}