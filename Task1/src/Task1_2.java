import java.util.Scanner;

public class Task1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner Scan = new Scanner(System.in);
	      
	      
	      System.out.println("Enter your name");
	     String name = Scan.next();
	      
	      System.out.println("Enter your age");
	      int age = Scan.nextInt();
	      
	      System.out.println("Enter your email");
	      String email = Scan.next();
	    
	      System.out.println("Enter your Faculty");
	      String faculty = Scan.next();
	      
	      Scan.close();
	      
	      System.out.println("your name is: "+ name);
	      System.out.println("your age is: "+ age);
	      System.out.println("your email is: "+ email);
	      System.out.println("your faculty is: "+ faculty);
		
	}

}
