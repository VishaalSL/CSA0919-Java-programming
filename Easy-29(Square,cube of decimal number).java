import java.util.Scanner;
class square
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the decimal number:");
		float n=input.nextFloat();
		System.out.print("Square:"+(n*n));
		System.out.print("\nCube:"+(n*n*n));
	}
}
		
