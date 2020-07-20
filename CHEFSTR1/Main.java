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
		    int total=sc.nextInt();
		    int arr[]=new int[total];
		    for(int i=0;i<total;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    long count=0;
		    for(int i=0;i<arr.length-1;i++)
		    {
		        if(arr[i]!=arr[i+1])
		        {
		            if(arr[i]<arr[i+1])
		            {
		                count+=Long.valueOf(arr[i+1]-arr[i]+1-2);
		            }
		            else if(arr[i]>arr[i+1])
		            {
		                count+=Long.valueOf(arr[i]-arr[i+1]+1-2);
		            }
		        }
		        else if(arr[i]==arr[i+1])
		        {
		            continue;
		        }
		    }
		    System.out.println(count);
		}
	}
}
