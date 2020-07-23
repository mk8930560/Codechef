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
		    int s=sc.nextInt();
		    int w1=sc.nextInt();
		    int w2=sc.nextInt();
		    int w3=sc.nextInt();
		    if(w1+w2+w3<=s)
		    {
		        System.out.println("1");
		    }
		    else if(w1+w2<=s || w2+w3<=s)
		    {
		        System.out.println("2");
		    }
		    else
		    {
		        System.out.println("3");
		    }
		}
	}
}
