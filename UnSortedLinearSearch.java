package preparation;

public class UnSortedLinearSearch {
	public static int unSortedLinearSearch(int arr[],int n,int data)
	{
		for(int i=0;i<=n;i++)
		{
			if(arr[i]==data)
			{
				return arr[i];
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7};
		int n=arr.length;
		int data=6;
		int result=unSortedLinearSearch(arr, n, data);
		System.out.println("Element found at index " + result);
		

	}

}
