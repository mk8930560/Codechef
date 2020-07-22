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
		    int n=sc.nextInt();
		    int val=0;
		    int count=0;
		    while(n>0)
		    {
		        for(int i=0;i<=n;i++)
		        {
		            int j=i+1;
		            if(i*i<=n && j*j<=n)
		            {
		                val=j*j;
		            }
		        }
		        n=n-val;
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
