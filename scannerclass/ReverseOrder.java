package scannerclass;

public class ReverseOrder {

	public static void main(String[] args) {
		/*String s;
		s="java";
		int i,l;
		l=s.length();
		System.out.println("the String is: " +s);
		System.out.println("the reverse String is: ");
		for (i=l-1;i>=0;i--);
		{
		System.out.println(s.charAt(i));
		}*/
         
		//reverse String
		//IMP
		
		String s="hello",ny=" ";
		char ch;
		System.out.println("orignal word:"+" hello");
		//System.out.println("hello");
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			ny=ch+ny;
		}
		System.out.println("reverse word: "+ny);
	
		}
	}


