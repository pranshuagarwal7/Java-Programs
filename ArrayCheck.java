import java.util.Scanner;

public class ArrayCheck {
	public static boolean check(int a[],int startindex)
	{
		if(startindex>a.length-1)
		{
			return false;
		}

		if(a[startindex]==7)
			return true;
		else
			return	check(a,startindex+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,7,9,6};
		boolean ans=check(a,0);
		System.out.println(ans);
	}

}
