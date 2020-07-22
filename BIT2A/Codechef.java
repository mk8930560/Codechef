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
		    int arr1[]=new int[n];
		    int arr2[]=new int[n];
		    int count=0;
		    for(int i=0;i<n;i++)
		    {
		        arr1[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {count=0;
		        for(int j=i+1;j<n;j++)
		        {
		            if(arr1[i]<arr1[j])
		            {
		                count++;
		            }
		        }
		        arr2[i]=count;
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(arr2[i]+" ");
		    }
		    System.out.println("");
		}
	}
}
