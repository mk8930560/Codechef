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
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        sum+=arr[i];
		    }
		    if(sum%2==0)
		    {
		        if(k==1)
		        {
		            System.out.println("odd");
		        }
		        else
		        {
		            System.out.println("even");
		        }
		        
		    }
		    else
		    {
		        System.out.println("even");
		    }
		}
	}
	
}
