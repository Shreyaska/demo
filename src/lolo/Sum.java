package lolo;

import java.util.Scanner;

public class Sum {
public static void main(String[] args)
{
	int a,b,sum;
	System.out.println("Enter first number:");
	Scanner ref = new Scanner(System.in);
	a=ref.nextInt();
	System.out.println("Enter second number:");
	b=ref.nextInt();
	sum=a+b;
	System.out.println("Addition of two number:" +" " +sum);
}
}
