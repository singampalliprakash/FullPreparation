package preparation;

import java.util.HashMap;
import java.util.Map;

public class KMmostFrequentWordsinaFile {
	public static int kMostFrequentWords(String s)
	{
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		s =s.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		String[] words=s.split(" ");
		for(String word:words)
		{
			map.put(word,map.getOrDefault(word,0)+1);
		}
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue()>=3)
			{
				System.out.println("\"" +entry.getKey() + "\":" + entry.getValue());
			}
			
		}
		
		return 0;
		
	}
	public static void main(String[] args) {
		String s="Welcome to the world of Geeks. This portal has been created to provide well written well "
				+ "thought and well explained solutions for selected questions If you like Geeks for Geeks "
				+ "and would like to contribute here is your chance You can write article and mail your article "
				+ "to contribute at geeksforgeeks org See your article appearing on the Geeks for Geeks main page "
				+ "and help thousands of other Geeks";
		kMostFrequentWords(s);
		

	}

}
