	import java.util.Scanner;
	class Employee{
	String Emp_name;
	int Emp_id;
	String Address;
	String Mail_id;
	int Mobile_no;
	void display(){
	System.out.println("employee name "+Emp_name);
	//Syetem.out.println(Address);
	System.out.println("employee id "+Emp_id);
	System.out.println("employee mail id "+Mail_id);
	System.out.println("employee mobile no "+Mobile_no);
	}
	}
	class Programmer extends Employee{  
	 int BP; 
	
	/*int  DA= (int) (0.97*BP);
	 HRA=(int) (0.10*BP);
	 PF=(int) (0.12*BP);  */
	void display(){
	    System.out.println(BP);
	 System.out.println("DA "+0.97*BP);
	 System.out.println("HRA "+0.10*BP);
	    System.out.println("PF "+0.12*BP);
	 System.out.println("SATFF CLUD FUND "+0.001*BP);
	        
	}
	} 
	class Assistant_Professor extends Employee{  
	 int BP; 
	
	void display(){
	    System.out.println(BP);
	 System.out.println("DA "+0.97*BP);
	 System.out.println("HRA "+0.10*BP);
	    System.out.println("PF "+0.12*BP);
	 System.out.println("SATFF CLUD FUND "+0.001*BP);
	        
	}
	} 
	class Associate_Professor extends Employee{  
	 int BP; 
	
	void display(){
	    System.out.println(BP);
	 System.out.println("DA "+0.97*BP);
	 System.out.println("HRA "+0.10*BP);
	    System.out.println("PF "+0.12*BP);
	 System.out.println("SATFF CLUD FUND "+0.001*BP);
	        
	}
	} 
	class Professor extends Employee{  
	 int BP; 
	
	void display(){
	    System.out.println(BP);
	 System.out.println("DA "+0.97*BP);
	 System.out.println("HRA "+0.10*BP);
	    System.out.println("PF "+0.12*BP);
	 System.out.println("SATFF CLUD FUND "+0.001*BP);
	        
	}
	} 
	public class EmployeeDetails{
	public static void main(String args[]){
	    System.out.println("\n1.Programmer\n2.Assistant_Professor\n3.Associate_Professor\n4.Professor");
	Scanner input=new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int ch=input.nextInt();
	 switch (ch) {
	         case 1:
	              Employee e1=new Employee();
	           Programmer p1=new Programmer();
	           e1.Emp_name="ABC";
	           e1.Address="y-city";
	           e1.Mail_id="praw@gmail.com";
	           e1.Emp_id=567;
	           e1.Mobile_no=2345678;
	           p1.BP=15000;
	           p1.display();
	              e1.display();
	              break;
	         case 2:
	           Employee e2=new Employee();
	           Assistant_Professor p2=new Assistant_Professor();
	           e2.Emp_name="DEF";
	           e2.Address="A-city";
	           e2.Mail_id="RAJAN@gmail.com";
	           e2.Emp_id=123;
	           e2.Mobile_no=987321;
	           p2.BP=30000;
	           p2.display();
	              e2.display();
	              break;
	         case 3:
	           Employee e3=new Employee();
	           Associate_Professor p3=new Associate_Professor();
	           e3.Emp_name="GHF";
	           e3.Address="B-city";
	           e3.Mail_id="MAIN@gmail.com";
	           e3.Emp_id=456;
	           e3.Mobile_no=98710;
	           p3.BP=30000;
	           p3.display();
	              e3.display();
	              break;
	         case 4:
	           Employee e4=new Employee();
	           Professor p4=new Professor();
	           e4.Emp_name="KANNAN";
	           e4.Address="TRICHY";
	           e4.Mail_id="kanna@gmail.com";
	           e4.Emp_id=789;
	           e4.Mobile_no=9810;
	           p4.BP=30000;
	           p4.display();
	              e4.display();
	              break;
	         case 5:
	           //exit(1);
	         
	         default: 
	          System.out.println("enter correct choice");
	   
	      } 
	}
	}