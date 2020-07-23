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
		    int n=sc.nextInt();
		    if(n%2==0)
		    {
		        if(Math.abs(a)==Math.abs(b))
		        {
		            System.out.println("0");
		        }
		        else if(Math.abs(a)>Math.abs(b))
		        {
		            System.out.println("1");
		        }
		        else
		        {
		            System.out.println("2");
		        }
		    }
		    else
		    {
		        if(a==b)
		        {
		            System.out.println("0");
		        }
		        else if(a>b)
		        {
		            System.out.println("1");
		        }
		        else
		        {
		            System.out.println("2");
		        }
		    }
		}
	}
}
