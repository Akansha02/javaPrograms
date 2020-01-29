package all_about_generalPrograms;

import java.util.HashMap;

public class Number_Frequency_InArray {

	public static void main(String[] args) {
		
		int[] a = {10,2,4,2,34,55,2,2,34,55};
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		int value = 1;
		//for(int i=0;i<a.length;i++)
		{
			//if(hm.containsKey(a[key]))
			{
				//hm.replace(key, value++);
			}
			//else
		//		hm.put(a[i], value);
		}
		
		for(int i:a)
		{
			hm.put(i, value);
			System.out.println(hm);
		}
		
		//while(!hm.isEmpty())
			//System.out.println(hm);
			

	}

}
