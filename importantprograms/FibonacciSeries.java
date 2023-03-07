package importantprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int limit=5;
		int[] series=new int [limit];
		series[0]=2;
		series[1]=3;
		for(int i=2;i<limit;i++) {
			series[i]=series[i-1]+series[i-2];
		}
			System.out.println("fibonacci no. upto :"   +  limit);
		
			for(int i=0;i<limit;i++) {
				System.out.println(series[i] +" ");
				
			}
			
		
		
		
  	}

}
