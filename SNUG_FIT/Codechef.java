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
		    int length=sc.nextInt();
		    int arr1[]=new int[length];
		    int arr2[]=new int[length];
		    for(int i=0;i<length;i++)
		        arr1[i]=sc.nextInt();
		    for(int i=0;i<length;i++)
		        arr2[i]=sc.nextInt();
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    long sum=0;
		    for(int i=0;i<length;i++)
		    {
		        if(arr1[i]<=arr2[i])
		            sum+=arr1[i];
		        else if(arr1[i]>arr2[i])
		            sum+=arr2[i];
		    }
		    System.out.println(sum);
		}
	}
}
