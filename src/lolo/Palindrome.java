package lolo;

import java.util.Scanner;

public class Palindrome {
public static void main (String[] args)
{
	int n,r,temp, sum=0;
	System.out.println("Enter a number");
	Scanner ref= new Scanner(System.in);
	n=ref.nextInt();
	
	temp=n;
	while(n>0)
{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
}
	if(temp==sum)
		System.out.println("palindrome");
	else
		System.out.println("not a plaindrome");
}
}
