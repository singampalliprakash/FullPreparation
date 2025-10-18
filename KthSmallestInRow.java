package preparation;

import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestInRow {

	public static void main(String[] args) {
		int arr[][]= {
				{1, 5, 9},
	            {10, 11, 13},
	            {12, 13, 15}
				
		};
		int k=8;
		ArrayList<Integer> li=new ArrayList<>();
		for(int[] row:arr)
		{
			for(int val:row)
			{
				li.add(val);
			}
		}
		Collections.sort(li);
		System.out.println("k th smallest value: " + li.get(k-1));
	}
	


}
