package preparation;

public class MissingAndRepeating {
	public static void missingAndRepeating(int arr[],int n)
	{
		int missing=-1;
		int repeating=-1;
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]==i)
				{
					count++;
				}
			}
			if(count==0)
			{
				missing=i;
			}
			else if(count>1)
			{
				repeating=i;
			}
			
		}
		System.out.println("Missing Number: " + missing);
        System.out.println("Repeating Number: " + repeating);
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8,9,2};
		int n=arr.length+1;
		missingAndRepeating(arr, n);
		

	}

}
