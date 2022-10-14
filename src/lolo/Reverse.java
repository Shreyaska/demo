package lolo;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)
	{
		int r,n,sum=0;
		System.out.println("Enter a number");
		Scanner ref= new Scanner(System.in);
		n=ref.nextInt();
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		System.out.println("reverse"+" "+sum);
	}

}
