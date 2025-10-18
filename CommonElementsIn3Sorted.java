package preparation;

public class CommonElementsIn3Sorted {
	public static void commonElementsIn3Sorted(int arr1[],int arr2[],int arr3[])
	{
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length)
		{
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
				System.out.println(arr1[i] +" ");
				i++;
				j++;
				k++;
				
				
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr2[j]<arr3[k])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50,60};
		int arr2[]= {20,60,70,80,90,100};
		int arr3[]= {20,40,50,60,70,80};
		commonElementsIn3Sorted(arr1, arr2, arr3);

	}

}
