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
		    int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			int max = 0;
			for (int i = 0; i < n - 1; i++)
			{
				int count = 0;
				for (int j = i; j < n; j++)
				{
					if (arr[i] == arr[j])
					{
						count++;
					}
				}
				if (count > max)
				{
					max = count;
				}
			}
			System.out.println(n - max);
		    
		}
	}
}
