package oops;
class Login
{
	private int id;
	private int number;
	private String name;
	private int password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
}
public class Encapsulation
{

	public static void main(String[] args) 
	{
      Login l=new Login();
      l.setId(123);
      l.setName("pradnya");
      l.setNumber(992267);
      l.setPassword(1111);
      System.out.println(l.getId());
      System.out.println(l.getName());
      System.out.println(l.getNumber());
      System.out.println(l.getPassword());
      
      
	}

}
