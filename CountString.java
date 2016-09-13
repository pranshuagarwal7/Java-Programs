import java.util.Scanner;

public class CountString {
	public static void Count()
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int x=0,y=1,z=1;
		while(!str.contains("$"))
		{
			for(int i=0;i<str.length();i++)
			{
				x++;
			}
			str=sc.nextLine();
			y++;
			
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				z++;
		}

		System.out.println("No of character"+" "+x);
		System.out.println("No of words"+" "+z);
		System.out.println("No of lines"+" "+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count();
	}

}
