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
		   int apple=sc.nextInt();
		   int orange=sc.nextInt();
		   int coin=sc.nextInt();
		   int diff=Math.abs(apple-orange);
		   if(diff>=coin)
		   {
		       int left=diff-coin;
		       System.out.println(left);
		   }
		   if(diff<coin)
		   {
		       System.out.println(0);
		   }
		}
	}
}
