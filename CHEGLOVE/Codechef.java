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
		    int arr2[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        arr2[i]=sc.nextInt();
		    }
		    int front=0;
		    int back=0;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]>arr2[i])
		        {
		            front=1;
		            break;
		        }
		    }
		    int j=n-1;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]>arr2[j])
		        {
		            back=1;
		            break;
		        }
		        --j;
		    }
		    if(front==0 && back==0)
		    {
		        System.out.println("both");
		    }
		    else if(front==1 && back==0)
		    {
		        System.out.println("back");
		    }
		    else if(front==0 && back==1)
		    {
		        System.out.println("front");
		    }
		    else if(front==1 && back==1)
		    {
		        System.out.println("none");
		    }
		}
	}
}
