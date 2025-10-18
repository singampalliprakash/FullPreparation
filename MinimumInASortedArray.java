package preparation;

import java.util.Arrays;

public class MinimumInASortedArray {
	public static int minimumInASortedArray(int arr[])
	{
		Arrays.sort(arr);
		int min=arr[0];
//		boolean falg=false;
		for(int i=1;i<arr.length;i++)
		{
			int res=Math.min(min, arr[i]);
		}
		return min;
		
	}

	public static void main(String[] args) {
		int arr[] = {5, 6, 2, 3, 4};
			System.out.println("the Minimum value in an Array:" + minimumInASortedArray(arr));
		
		// TODO Auto-generated method stub

	}

}
