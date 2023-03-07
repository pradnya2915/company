package micro;  // override
class Moon{
	public void m(String a) {
		System.out.print("pradnya ");
	}
}
public class Sun extends Moon {
	
public void m(String a) {
	super.m(a);
	System.out.print(" bhor  "+a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sun s=new Sun();
       s.m("\n awasari");
	}

}
