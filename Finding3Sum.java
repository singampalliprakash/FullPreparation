package preparation;

import java.util.ArrayList;
import java.util.List;

public class Finding3Sum {
	public static List<List<Integer>> finding3Sum(int[] arr)
	{
		int n1=arr.length;
		List<List<Integer>> li=new ArrayList<>();
		for(int i=0;i<n1-2;i++)
		{
			for(int j=i+1;j<n1-1;j++)
			{
				for(int k=j+1;k<n1;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						List<Integer> l=new ArrayList<>();
						l.add(arr[i]);
						l.add(arr[j]);
						l.add(arr[k]);
						li.add(l);
						
					}
				}
			}
		}
		return li;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,-1,2,5};
		List<List<Integer>> res=finding3Sum(arr);
		for(List<Integer> le:res)
		{
			System.out.println(res.get(0) + " " +res.get(1) + " " +res.get(2));
			
		}
		

	}

}
