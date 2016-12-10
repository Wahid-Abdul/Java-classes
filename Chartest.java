import java.util.*;
import java.lang.*;
class Main{
	public static void main(String args[])
	{
		String str = "habit";
		HashMap<Character,Character> map = new HashMap();
		map.put('a','e');
		map.put('e','i');
		map.put('i','o');
		map.put('o','u');
		map.put('u','a');
		char[] a = str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
		if(map.get(a[i])==null)
		{
		System.out.print(a[i]);
		}
		else
		{
		System.out.print(map.get(a[i]));
		}
		}
	}
}
