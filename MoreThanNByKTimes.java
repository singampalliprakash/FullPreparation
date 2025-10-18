package preparation;

import java.util.HashMap;
import java.util.Map;

public class MoreThanNByKTimes {
	public static void moreThanNByKTimes(int arr[],int n,int k)
	{
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>n/k)
			{
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,3,6,5,4,4,4,2,3,2,3};
		int n=arr.length;
		int k=4;
		moreThanNByKTimes(arr, n, k);
		
	}

}
