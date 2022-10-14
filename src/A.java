import java.util.Scanner;

class A
{
	public static void main(String[] args)
	{
		int a,b,sum;
		System.out.print("Enter two numbers");
		Scanner ref= new Scanner(System.in);
		a= ref.nextInt();
		b= ref.nextInt();
		sum=a+b;
		System.out.println("Addition" +sum);
	}
}