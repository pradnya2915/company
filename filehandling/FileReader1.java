package filehandling ;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;

public class FileReader1 
{

	public static void main(String[] args) throws IOException
	{
	/* File sc=new File("C:\\Users\\user\\Desktop\\bhor.txt")	;
	 sc.createNewFile();
	 try
	 {
   FileReader nt=new FileReader("C:\\Users\\user\\Desktop\\bhor.txt");
   
   try
   {
	   int i;
	   while((i=nt.read())!=-1) 
	   {
		   System.out.println((char)i);
		   System.out.println("hello");
	   }
   
	 }
   catch(Exception e)
   {
	   System.out.println("exp creted");
   }
	 }
     finally
     {
    	 sc.canRead();
    	 
      //System.out.println(); 
     }
   //catch(Exception e)
   //{
	  // System.out.println();
   //}*/
	  
		File s=new File("C:\\Users\\user\\Desktop\\demo1.txt");
		s.createNewFile();
		FileReader nt=new FileReader("C:\\Users\\user\\Desktop\\demo1.txt");
		
		try
		{
			nt.read();
			System.out.println();
		}
		finally 
		{
			nt.close();
			
		}
    }
}
       /*  methods of file handling
        canwrite;
        canread
        read
        exist
        delete
        length
        createfile
        mkdir ==to crate the file directory*/
