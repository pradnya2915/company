package starpattern;

public class SortedMax {

	public static void main(String[] args) {
	//int a[]=new a[5];
    int a[]={12,34,56,78,4,3};
    int max=a[0];
    for(int i=0;i<a.length;i++) {
    	if(a[i]>max) {
    		max=a[i];
    		
    	}
    	
    }
    System.out.println(max);
	}

}
