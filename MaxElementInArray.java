package preparation;

public class MaxElementInArray {
	public static int maxElementInArray(int arr[])
	{
		int res=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			res=Math.max(res, arr[i]);
		}
		return res;
		
	}

	public static void main(String[] args) {
		int arr[]= {5, 6, 1, 2, 3, 4};
		System.out.println(maxElementInArray(arr));

	}

}
