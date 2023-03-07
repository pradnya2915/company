package filehandling;

import java.io.File;
import java.io.FileWriter;

public class FileWriter1 
{
    
	public static void main(String[] args)throws Exception 
	{
	/*  File sc=new File("C:\\Users\\user\\Desktop\\pradnya1.txt");
	//  sc.createNewFile();
	  //try
	  {
		  FileWriter f=new FileWriter("C:\\Users\\user\\Desktop\\pradnya1.txt");
		 try 
		 {
			String s;
			//while ((s=f.write())=password123) 
			f.write("PPPPPPPPPPPPPPPPPPPP");
			
				System.out.println("SUCCESSFULLYYYYYYY");
			}
			catch(Exception e)
			 {
				 System.out.println("EXCEPTION");
			 }
	  }
			//finally 
			{ 
				//f.close();
				//System.out.println("OCCURED EXP");
				
			}
		 
		 /*catch(Exception e)
		 {
			 System.out.println();
		 }*/
		
		FileWriter nt=new FileWriter("C:\\Users\\user\\Desktop\\Demo.txt");
		
		try
		{
			nt.write("pradnya bhor");
			
		}
		finally
		{
			nt.close();
		}
	  }

	}


