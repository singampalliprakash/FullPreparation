package preparation;

public class RecursiveBinarySearchAlgorithm {
	public static int recursiveBinarySearchAlgorithm(int arr[],int left,int right,int data)
	{
		if(left>right)
			return -1;
		int mid=left+(right-left)/2;
		if(data==arr[mid])
		{
			return mid;
		}
		else if(data<arr[mid])
		{
			return recursiveBinarySearchAlgorithm(arr, left, mid-1, data);
		}
		else
		{
			return recursiveBinarySearchAlgorithm(arr, mid+1, right, data);
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		int left=0;
		int right=arr.length-1;
		int data=40;
		int result=recursiveBinarySearchAlgorithm(arr, left, right, data);
		if(result!=-1)
		{
			System.out.println("element found by the index of:"+ result);
			
		}
		else
		{
			System.out.println("element not found");
		}
		

	}

}
