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
		    int arr[]=new int[6];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=sc.nextInt();
		    }
		    int p=arr[arr.length-1];
		    int max=120;
		    int totalwork=0;
		    for(int i=0;i<arr.length-1;i++)
		    {
		        totalwork+=arr[i]*p;
		    }
		    if(totalwork<=max)
		        System.out.println("No");
		    else
		        System.out.println("Yes");
		}
	}
}
