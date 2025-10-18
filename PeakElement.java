package preparation;

public class PeakElement {
	public static int peakElement(int arr[])
	{
		int peak=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(peak<arr[i])
			{
				peak=arr[i];
			}
			if(arr[i-1]<arr[i] && arr[i+1]<arr[i])
			{
				peak=arr[i];
				break;
			}
		}
		return peak;
		
	}

	public static void main(String[] args) {
		int arr[]= {1, 2, 4, 5, 7, 8, 3};
		peakElement(arr);
		
		
		

	}

}
