package preparation;

public class LargestPairSumInArray {
	public static int largestPairSumInArray(int arr[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				if(sum>max)
				{
					 max=sum;
				}
			}
		}
		return (max == Integer.MIN_VALUE) ? -1 : max;
		
	}

	public static void main(String[] args) {
		int arr[]=  {12, 34, 10, 6, 40};
		System.out.println(largestPairSumInArray(arr));

	}

}
