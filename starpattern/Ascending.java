package starpattern;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1,k=5;i<=5;i++,k--) {
    	int p=k;
    	for(int j=1;j<=i;j++) {
    		System.out.print(" ");
    	}
    	for(int a=i;a<=5;a++) {
    		System.out.print(p--+"");
    	}
    	System.out.println();
    }
	}

}
