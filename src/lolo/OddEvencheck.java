package lolo;

import java.util.Scanner;

public class OddEvencheck
{
public static void main(String[] args)
{
	int i,n;
	System.out.println("Enter any number:");
	Scanner ref= new Scanner(System.in);
	n=ref.nextInt();
	if(n%2==0)
	{
		System.out.println("number is even");
		
	}
	else
	{
		System.out.println("number is odd");
		
	}
	
}
}