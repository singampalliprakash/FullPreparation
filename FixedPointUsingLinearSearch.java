package preparation;

public class FixedPointUsingLinearSearch {
	public static int fixedPointUsingLinearSearch(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==i)
			{
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]= {-10, -5, 0, 3, 7};
		System.out.println(fixedPointUsingLinearSearch(arr));
		// TODO Auto-generated method stub

	}

}
