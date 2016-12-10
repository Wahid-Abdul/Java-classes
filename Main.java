import java.util.*;
import java.lang.*;
class Main{
public static void main(String args[])
{
	int n = 12345;
	String str = Integer.toString(n);
	char[] a = str.toCharArray();
	int i,total=0;	
	for(i=0;i<a.length;i++)
	{
	total+=Math.pow(Character.getNumericValue(a	[i]),Character.getNumericValue(a[(i+1)%a.length]));
	}
	System.out.println(total);
	}	
}
