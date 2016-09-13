import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.print(a + " "+ b);
		for (int i=2;i<n;++i)
		{
			int temp=a+b;

			System.out.print(" "+temp);
			a=b;
			b=temp;


		}


	}

}
