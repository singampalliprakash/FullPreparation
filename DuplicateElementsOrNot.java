package preparation;

public class DuplicateElementsOrNot{
	public static void DuplicateElementsOrNot(int arr[],int n)
	{
		boolean found=false;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate elements exist:"+ arr[i]);
					
					found=true;
					
				}
			}
		}
		if (!found) {
			System.out.println("No duplicate elements found.");
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,4,2,5};	
		int n=arr.length;
		
		DuplicateElementsOrNot(arr, n);

	}

}


//O(n^2)
