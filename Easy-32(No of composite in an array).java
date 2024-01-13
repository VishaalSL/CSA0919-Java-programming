import java.util.Scanner;
class count
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=input.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=1;j<=a[i];j++)		
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count>2)
			{
				c++;
			}
		}
		System.out.print("Number of composite number in an array:"+c);
	}
}
