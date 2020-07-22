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
		    String s=sc.next();
		    int flag=0;
		    for(int i=0;i<s.length()-1;i++)
		    {
		        if((s.charAt(i)=='E' && s.charAt(i+1)=='C')||(s.charAt(i)=='S' && s.charAt(i+1)=='E')||(s.charAt(i)=='S' && s.charAt(i+1)=='C'))
		        {
		           flag=1;
		        }
		    }
		    if(flag==1)
		    {
		        System.out.println("no");
		    }
		    else
		    {
		        System.out.println("yes");
		    }
		}
	}
}
