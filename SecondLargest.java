package preparation;

public class SecondLargest {
	public static int secondLargest(int arr[],int first,int sec)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				first=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>sec&& arr[i]!=first)
			{
				sec=arr[i];
			}
		}
		
		return sec;
		
	}

	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int first=0;
		int sec=0;
		int result=secondLargest(arr, first, sec);
		if(result!=0)
		{
			System.out.println(" Second largest value in an array:" + result);
		}
		
		// TODO Auto-generated method stub

	}

}
