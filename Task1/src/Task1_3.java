import java.util.Scanner;

public class Task1_3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Customer customer = new Customer();
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
      
      /*
      System.out.println("your name is: "+ customer.name);
      System.out.println("your age is: "+ customer.age);
      System.out.println("your email is: "+ cusntomer.email);
      System.out.println("your faculty is: "+ customer.faculty);*/
		  Customer c = new Customer();
		//  customer.fillData();
		 
		  
		  c.printData(name, age, email, faculty);
		
		
		
		
	}

}
