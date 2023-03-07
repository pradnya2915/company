package sorting;

public class BubbleSortings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[]a= {23,45,67,89,12,10,98};
    int temp;
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a.length-1-i;j++) {
    		if(a[j]>a[j+1]) {
    			temp=a[j];
    			a[j]=a[j+1];
    			a[j+1]=temp;
    		}
    	}
    }
    for(int i=0;i<a.length;i++) {
    	System.out.println(a[i]+" ");
    }
	}

}
