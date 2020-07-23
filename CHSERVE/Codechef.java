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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int k=sc.nextInt();
		    int fn=(a+b)/k;
		    if(fn%2==0)
		    {
		        System.out.println("CHEF");
		    }
		    else
		    {
		        System.out.println("COOK");
		    }
		}
	}
}
