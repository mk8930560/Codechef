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
		long m=sc.nextInt();
		long c=sc.nextInt();
		long pos=0;
		long neg=0;
		while(t-->0)
		{
		    long x=sc.nextInt();
		    long y=sc.nextInt();
		    long p=sc.nextInt();
		    long g=y-m*x-c;
		    if(g>0)
		    {
		        pos+=p;
		    }
		    else
		    {
		        neg+=p;
		    }
		}
		System.out.println(Math.max(pos,neg));
	}
}
