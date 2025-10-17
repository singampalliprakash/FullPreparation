package preparation;

import java.util.Arrays;

public class ComplexityReduceOFDuplicateElements {
	public static int complexityReduceOFDuplicateElements(int arr[],int n)
	
	{
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(arr[i]==arr[i+1]) 
			{
				System.out.println("Duplicate elements are " + arr[i]);
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,50,20,30,40};
		int n=arr.length-1;
		
		int result=complexityReduceOFDuplicateElements(arr, n);
		
		
		

	}

}
