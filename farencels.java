import java.util.Scanner;

public class farencels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the temp in farenheit");
		int f =sc.nextInt();

		
		while(f<=300)
		{
			int c=((5)*(f-32))/9;
			System.out.println(f +" "+ c);
			f+=20;
		
		}
			
			
			
	} 

}
