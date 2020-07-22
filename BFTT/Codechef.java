/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long n=sc.nextLong();
		    for(long i=n+1;;i++)
		    {
		        if(check(i))
		        {
		            System.out.println(i);
		            break;
		        }
		    }
		}
	}
	public static boolean check(long n)
	{
	    String s=String.valueOf(n);
		int count=0;
		for(int j=0;j<s.length();j++)
		{
		    if(s.charAt(j)=='3')
		    {
		        count++;
		    }
        }
		if(count>=3)
		{
		    return true;
		}
		else
		return false;
	}
}
