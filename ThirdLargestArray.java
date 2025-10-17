package preparation;

import java.util.Arrays;

public class ThirdLargestArray {
	public static int thirdLargestArray(int arr[],int first,int sec,int n)
	{
		Arrays.sort(arr);
		for(int i=n-3;i>0;i--)
		{
			if(arr[i]!=arr[n-1] && arr[i]!=arr[n-2])
			{
				return arr[i];
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int n=arr.length;
		int first=arr[n-1];
		int sec=arr[n-2];
		int result=thirdLargestArray(arr, first, sec, n);
		if(result!=0)
		{
			System.out.println("third Largest number:"+result);
		}
		
		
		

	}

}
