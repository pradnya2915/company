package sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[]a= {23,43,56,78,89,98,12,21,10,3};
  int min;
  int temp;
  
  for(int i=1;i<a.length;i++)
  {
	  for(int j=i+1;j<a.length-1-i;j++) {
		  
		  if(a[j]<a[i]) {
	  temp=a[i];
	  a[i]=a[j+1];
	  a[j+1]=temp;
		  } 
  }
  }
  for(int i=0;i<a.length;i++) {
	  System.out.println(i);
	  
  }
	}

}
