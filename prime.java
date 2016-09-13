import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int i=2;
		int flag=0;
		
		while (i<num){
			if (num%i==0)
			{
				System.out.println("Not prime");
				flag=1;
				break;
			}
		
			else
				i++;
			
		}
		if(flag!=1)
		System.out.println("Prime");
		

	}

}
