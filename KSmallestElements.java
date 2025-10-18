package preparation;

import java.util.Arrays;

public class KSmallestElements {
	public static void kSmallestElements(int arr[],int k)
{
		
		Arrays.sort(arr);
		int n=arr.length;
		System.out.println(k + " Smallest elements are ");
		
		for(int i=0;i<k;i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {10,20,50,60,40,80};
		int k=2;
		kSmallestElements(arr, k);
		}
		// TODO Auto-generated method stub

	}


