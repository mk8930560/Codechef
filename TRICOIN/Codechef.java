/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int sum(int h)
	{
		return (h*(h+1)/2);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		  int h=1;
		  while(sum(h)<=n)
		  {
			  h++;
		  }
		  System.out.println(h-1);
		}
	}
}
