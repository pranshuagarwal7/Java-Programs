
public class InsertionSort {
	public static void insertsort(int a[])
	{
		int k=0,i,j;

		for( i=0;i<a.length-1;i++)
		{
			k=a[i+1];
			for( j=i;j>=0&&a[j]>k;j--)
			{
				a[j+1]=a[j];
			}
			a[j+1]=k;
		}
		System.out.println("The Sorted array is");
		for(i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]+" ");
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={8,17,4,2,20};
		insertsort(a);
	}
}
