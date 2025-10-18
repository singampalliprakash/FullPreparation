package preparation;

public class CeilingAndFloor {
	public static void ceilingAndFloor(int arr[])
	{
		int ceiling=-1;int floor=-1;
		int x=6;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<x)
			{
			floor=arr[i];
			}
			else if(arr[i]>=x)
			{
				ceiling=arr[i];
			}
		}
		System.out.println("Floor " + floor+ " Ceiling " +ceiling);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,76,8,6};
		ceilingAndFloor(arr);

	}

}
