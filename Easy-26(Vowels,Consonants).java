import java.util.Scanner;
class count
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the string:");
		String name=input.nextLine();
		int n=name.length();	
		char s[]=new char[n];
		char v[]=new char[n];
		char c[]=new char[n];
		int vo=0,co=0;
		for(int i=0;i<n;i++)
		{
			s[i]=name.charAt(i);
			if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'|| s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U' )
			{
				v[i]=s[i];
				vo++;
			}
			else
			{
				c[i]=s[i];
				co++;
			}
		}
		System.out.print("Vowels:");
		for(int i=0;i<vo;i++)
		{
			System.out.print(v[i]);
		}
		System.out.print("\nConsonants:");
		for(int j=0;j<co;j++)
		{
			System.out.print(c[j]);
		}
	}
}
