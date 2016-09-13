
public class FirstIndex {

	public static int check(int a[],int startindex)
	{
		if(startindex>a.length)
		{
			return -1;
		}
		if(a[startindex]==7)
			return startindex;
		else
		{
			return check(a,startindex+1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,7,7,6};
		int ans=check(a,0);
		System.out.println(ans);
	}

}


