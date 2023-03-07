package controlstatement;

public class ForEachstmt {
    public static void main (String[]args)
   {//array numbers
    int[] numbers= {1,2,3,4,90};
    int sum=1;
    //by using for each loop
    for(int number:numbers) {
    	sum+=number;
    }
    System.out.println("sum = "+sum);
    
    
   }
}
