package preparation;

import java.util.Arrays;

public class KLargestElements {
	public static void kLargestElements(int arr[],int k)
	{
		
		Arrays.sort(arr);
		int n=arr.length;
		System.out.println(k + "Largest elements are ");
		
		for(int i=n-k;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {10,20,50,60,40,80};
		int k=2;
		kLargestElements(arr, k);
		}
		// TODO Auto-generated method stub

	}


