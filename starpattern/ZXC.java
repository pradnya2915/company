package starpattern;

public class ZXC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,k;//, row = 6;       
		//Outer loop work for rows  
		for (i=1; i<6; i++)   
		{  
		//inner loop work for space      
		for (j=6-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (k=1; k<=i; k++ )   
		{   
		//prints star      
		System.out.print("1 ");
		//if(k==1||k==2||k==3||k==4||k==5);
		//System.out.print(k);
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		}   
		 

	}


