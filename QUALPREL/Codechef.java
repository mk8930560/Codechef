/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int arr[] = new int[N];
		    for(int i=0;i<N;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int arr1[]=new int[N];
		    int j=0;
		    for(int i=N-1;i>=0;i--)
		    {
		        arr1[j] = arr[i];
		        j++;
		    }
		    int x = arr1[K-1];
		    int count=0;
		    for(int i=0;i<arr1.length;i++)
		    {
		        if(arr1[i]>=x)
		             count++;
		    }
		    System.out.println(count);
		}
	}
}
