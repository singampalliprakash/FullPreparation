package preparation;

public class FirstRepeatingElement{
	public static int firstRepeatedElement(int arr[],int n)
	{
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
				
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,2,3,4};
		int n=arr.length;
		int result=firstRepeatedElement(arr, n);
		if (result != -1)
            System.out.println("First repeated element: " + result);
        else
            System.out.println("No repeated element found");
    }
		

	}


