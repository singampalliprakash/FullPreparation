package preparation;

public class BinarySearch {
	public static int binarySearchIteration(int arr[],int n,int data)
	{
		int left=0;
		int right=n-1;
		while(left<right)
		{
		int mid=left+(right-left)/2;
		if(data==arr[mid])
		{
			return mid;
		}
		else if(data<arr[mid])
		{
			right=mid-1;
		}
		else
		{
			left=mid+1;
		}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int n=arr.length;
		int data=30;
		int result=binarySearchIteration(arr, n, data);
		if(result!=-1)
		{
			System.out.println("element found by the index of:"+ result);
			
		}
		else
		{
			System.out.println("element not found");
		}
		// TODO Auto-generated method stub

	}

}
