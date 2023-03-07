package starpattern;

public class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j;   
		//outer loop for rows  
		for(i=0; i<=5; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
	
	}

}
