package starpattern;

public class FloydTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		int p=1;
    for(int i=1;i<=5;i++) {
    	for(int j=1;j<=i;j++) {
    		System.out.print(p+++" ");
    	}
    	System.out.println();
    }
	}

}
