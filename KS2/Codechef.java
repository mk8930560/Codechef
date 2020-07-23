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
		    long n=sc.nextLong();
		    long a=n;
		    int sum=0;
		    while(a>0)
		    {
		        sum+=a%10;
		        a=a/10;
		    }
		    for(int i=0;i<=9;i++)
		    {
		        if((sum+i)%10==0)
		        {
		            System.out.println(n+""+i);
		            break;
		        }
		    }
		}
	}
}
