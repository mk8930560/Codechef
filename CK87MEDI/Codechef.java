/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
			int k=sc.nextInt();
			Random r=new Random();
			ArrayList<Integer> arr=new ArrayList<Integer>();
			for(int i=1;i<=n;i++)
			{
				arr.add(sc.nextInt());
			}
			Collections.sort(arr);
			for(int i=1;i<=k;i++)
			{
				arr.add(r.nextInt(+1000));
			}
			System.out.println(arr.get((n+k)/2));
		}
	}
}
