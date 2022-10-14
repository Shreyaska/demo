package lolo;

public class Factoriall {
     
	static int factorial(int n){ 
		 if (n == 1)      
	          return 1;      
	        else      
	          return(n * factorial(n-1));
             
  } 
public static void main(String[] args) {  
System.out.println("Factorial of 8 is: "+factorial(8));  
System.out.println("Factorial of 1 is:"+factorial(1));
System.out.println("Factorial of 3 is:"+factorial(3));
}  
}  

