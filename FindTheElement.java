package preparation;

public class FindTheElement {
	public static int findElement(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]>arr[i] && arr[j+1]>arr[j])
				{
					return arr[j];
				}
				if(arr[j+1]>arr[j])
				{
					System.out.println(arr[j+1]);
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {5, 1, 4, 3, 6, 8, 10, 7, 9};
		findElement(arr);

	}

}
