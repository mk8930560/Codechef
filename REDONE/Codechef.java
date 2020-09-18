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
		int n=1000001;
		int M=1000000007;
		int arr[]=new int[n];
		arr[1]=1;
		for(int i=2;i<=1000000;i++)
		    arr[i]=(int)((arr[i-1]+i+((long)arr[i-1]*i))%M);
		while(t-->0)
		{
		    int index=sc.nextInt();
		    System.out.println(arr[index]);
		}
	}
}
