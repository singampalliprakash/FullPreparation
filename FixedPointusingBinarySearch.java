package preparation;

public class FixedPointusingBinarySearch {
	public static int fixedPointBinarySearch(int arr[])
	{
		int st=0;
		int end=arr.length-1;
		while(st<end)
		{
			int mid=st+(end-st)/2;
			if(arr[mid]==mid)
			{
				return mid;
			}
			else if(arr[mid]<mid)
			{
				st=mid+1;
				
			}
			else
				
			{
				end=mid-1;
			
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {-10, -5, 0, 3, 7};
		System.out.println(fixedPointBinarySearch(arr));
		// TODO Auto-generated method stub

	}

}
