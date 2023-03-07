package scannerclass;    // parameterized construtor

public class Constructor 
{
     String names;
     int ids;
   Constructor(String name,int id)
     {
    	 names=name;
    	ids=id;
    	System.out.println("my name is"+name);
    	System.out.println("number"+id);
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Constructor e=new Constructor("java",123);
      
      //in the no argument construtor are user defined 
      //
	}

}
