/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int count=0;
		    for(int i=0;i<n;i++)
		    {
		        for(int j=i;j<n;j++)
		        {
		            int sum=0;
		            int product=1;
		            for(int k=i;k<=j;k++)
		            {
		                sum+=arr[k];
		                product*=arr[k];
		            }
		            if(sum==product)
		            {
		                count++;
		            }
		        }
		    }
		    System.out.println(count);
		}
	}
}
