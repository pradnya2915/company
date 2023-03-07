package sorting;

public class Singleton {

	
			private static final Singleton instance = new Singleton();
			//Private constructor to prevent instantiation of the class from other classes.
			private Singleton(){
				
			}  
			public static Singleton getInstance(){
			return instance;
			}
			
	}


