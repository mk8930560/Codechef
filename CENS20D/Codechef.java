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
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int count=0;
	        for(int i=0;i<n-1;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                if((arr[i] & arr[j])==arr[i])
	                    count++;
	            }
	        }
	        System.out.println(count);
	    }
	}
}
