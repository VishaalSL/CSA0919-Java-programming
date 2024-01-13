import java.util.Scanner;
class arm
{
	public static void main(String args[])	
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=input.nextInt();
		int temp=num;
		int sum=0,d;
		while(num!=0)
		{
			d=num%10;
			sum=sum+(d*d*d);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.print("Armstrong number.");
		}
		else
		{
			System.out.print("Not armstrong number.");
		}
	}
}
