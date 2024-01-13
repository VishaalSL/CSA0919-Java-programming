import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=input.nextInt();
		int d,sum=0;
		while(num!=0)
		{
			d=num%10;
			sum=sum+d;
			num=num/10;
		}
		System.out.print("Sum of digits:"+sum);
	}
}
			
		
