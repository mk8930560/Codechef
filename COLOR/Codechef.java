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
		    int n=sc.nextInt();
		    String s=sc.next();
		    int cntR=0;
		    int cntG=0;
		    int cntB=0;
		    for(int i=0;i<n;i++)
		    {
		        if(s.charAt(i)=='R')
		        {
		            cntR++;
		        }
		        else if(s.charAt(i)=='G')
		        {
		            cntG++;
		        }
		        else if(s.charAt(i)=='B')
		        {
		            cntB++;
		        }
		    }
		    System.out.println(Math.min(Math.min((cntR+cntG),(cntG+cntB)),(cntR+cntB)));
		}
	}
}
