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
		    int total_elements=sc.nextInt();
		    int arr[]=new int[total_elements];
		    int total_Cases=(total_elements*(total_elements-1))/2;
		    int arr2[]=new int[total_Cases];
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int k=0;
		    for(int i=0;i<total_elements-1;i++)
		    {
		        for(int j=i+1;j<total_elements;j++)
		        {
		            arr2[k]=arr[i]+arr[j];
		            k++;
		        }
		    }
		    Arrays.sort(arr2);
		    int maxval=arr2[arr2.length-1];
		    int favourable_outcome=0;
		    for(int i=0;i<arr2.length;i++)
		    {
		        if(maxval==arr2[i])
		        {
		            favourable_outcome+=1;
		        }
		    }
		    double prob = Double.valueOf(favourable_outcome)/Double.valueOf(total_Cases);
		    System.out.format("%.8f", prob);
		    System.out.println();
		}
	}
}
