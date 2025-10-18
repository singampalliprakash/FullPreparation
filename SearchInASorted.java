package preparation;

public class SearchInASorted {
	public static int searchInASorted(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				return i;
			}
		}
		return -1;
		
	}
	

	public static void main(String[] args) {
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key=4;
		int result=searchInASorted(arr, key);
		if(result!=0)
		{
			System.out.println(+key + " is present at index " +result);
		}
		

	}

}
