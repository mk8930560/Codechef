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
	        int K=sc.nextInt();
	        int arr[]=new int[n];
	        int flag=0;
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	            if(arr[i]>K)
	                flag=1;
	        }
	        if(flag==1)
	            System.out.println("-1");
	        else
	        {
	            int sum=0;
	            int count=1;
	            for(int i=0;i<n;i++)
	            {
	                sum+=arr[i];
	                if(sum>K)
	                {
	                    count++;
	                    sum=arr[i];
	                }
	            }
	            System.out.println(count);
	        }
	    }
	}
}
