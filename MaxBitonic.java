package preparation;

public class MaxBitonic {
	public static void maxBitonic(int arr[])
	{
		int m=arr[0];
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]<m)
			{
				m=arr[i];
			}
			if(arr[i]<arr[i-1])
			{
				m=arr[i-1];
				break;
			}
			
		}
		System.out.println(m);
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,6,8,12,3,2,1};
		maxBitonic(arr);

	}

}
