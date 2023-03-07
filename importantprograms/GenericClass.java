package importantprograms;

public class GenericClass {

	public static void main(String[] args) {

			    // initialize generic class
			    // with Integer data
			    GenericsClass<Integer> intObj = new GenericsClass<>(5);
			    System.out.println("Generic Class returns: " + intObj.getData());

			    // initialize generic class
			    // with String data
			    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
			    System.out.println("Generic Class returns: " + stringObj.getData());
			  }
			}

			// create a generics class
			class GenericsClass<T> {

			  // variable of T type
			  private T data;

			  public GenericsClass(T data) {
			    this.data = data;
			  }

			  // method that return T type variable
			  public T getData() {
			    return this.data;
			  }
			
			// initialize the class with Integer data
			  /*  DemoClass demo = new DemoClass();

			    // generics method working with String
			    demo.<String>genericsMethod("Java Programming");

			    // generics method working with integer
			    demo.<Integer>genericsMethod(25);
			  }
			}

			class DemoClass {

			  // creae a generics method
			  public <T> void genericsMethod(T data) {
			    System.out.println("Generics Method:");
			    System.out.println("Data Passed: " + data);
			  }	*/
	}


