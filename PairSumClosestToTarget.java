package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSumClosestToTarget {
	public static List<Integer> pairSumClosestToTarget(int arr[],int target)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Arrays.sort(arr);
		int s=0;
		int e=arr.length-1;
		int Difference=Integer.MAX_VALUE;
		while(s<e)
		{
		int sum=arr[s]+arr[e];
		if(Math.abs(target-sum)<Difference)
		{
			Difference=Math.abs(target-sum);
			list.clear();
			list.add(arr[s]);
			list.add(arr[e]);
		}
		 if (sum == target) {
             break;
		 }
		else if(sum<target)
		{
			s++;
		}
		else if(sum>target)
		{
			e--;
		}
		}
		return list;
		
	}

	public static void main(String[] args) {
		int arr[]= {10,30,20,5};
		int target=25;
		System.out.println(pairSumClosestToTarget(arr, target));
		

	}

}
