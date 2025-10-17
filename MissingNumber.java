package preparation;

public class MissingNumber {
	public static int missingNumber(int arr[],int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			boolean flag=false;
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]==i)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
				return i;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {10,9,8,5,4,6,3,2,1};
		int n=arr.length+1;
		System.out.println(missingNumber(arr, n));
		
		// TODO Auto-generated method stub

	}

}

