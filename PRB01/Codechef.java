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
		    int a=sc.nextInt();
		    int count=0;
		    for(int i=2;i<=a;i++)
		    {
		        if(a%i==0)
		        {
		            count++;
		        }
		    }
		    if(count==1)
		    {
		        System.out.println("yes");
		    }
		    else
		    {
		        System.out.println("no");
		    }
		}
	}
}
