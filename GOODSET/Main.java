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
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    int k=1;
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i]=k;
		        k=k+2;
		    }
		    for(int i=0;i<arr.length;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
	}
}
