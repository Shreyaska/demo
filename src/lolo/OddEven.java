package lolo;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args)
	{
		int n,i,sum=0;
		System.out.println("Enter a range :");
		Scanner ref= new Scanner(System.in);
		n=ref.nextInt();
		if(n%2==0)
		{
			for(i=0;i<=n;i+=2)
			{
			sum=sum+i;
			}		
		System.out.println("Sum of even number is:" +" "+sum);
		}
		else
		{
			for(i=1;i<=n;i+=2)
			{
				sum=sum+i;
			
			}
			System.out.println("Sum of odd number is:"+" "+sum);
		}
		
	}

}
