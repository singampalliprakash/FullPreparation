package preparation;

import java.util.Arrays;

public class KthSmallestArrayUnsorted {
	public static int kthSmallestArray(int arr[],int k)
	{
		Arrays.sort(arr);
		return arr[k-1];
		
	}

	public static void main(String[] args) {
		int arr[]= {10,30,4,5,6,40,2,3,45};
		int res=kthSmallestArray(arr, 4);
		System.out.println(res);
		
		

	}

}
