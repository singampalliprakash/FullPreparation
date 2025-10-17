package preparation;

public class LargestArray {
	public static int largestArray(int arr[],int max)
	{
		for(int lar:arr)
		{
			if(max<lar)
			{
				max=lar;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		int arr[]= {10,320,30,20,50,60,980};
		int max=0;
		int result=largestArray(arr, max);
		if(result!=0)
		{
			System.out.println("largest value in an array:" + result);
		}
		

	}

}
