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
		    String s1=sc.next();
		    String s2=sc.next();
		    String s3=sc.next();
		    int flag=0;
		    if(s1.charAt(0)=='l' && s2.charAt(0)=='l' && s2.charAt(1)=='l')
		    {
		        flag=1;
		    }
		    else if(s1.charAt(1)=='l' && s2.charAt(1)=='l' && s2.charAt(2)=='l')
		    {
		        flag=1;
		    }
		    else if(s2.charAt(0)=='l' && s3.charAt(0)=='l' && s3.charAt(1)=='l')
		    {
		        flag=1;
		    }
		    else if(s2.charAt(1)=='l' && s3.charAt(1)=='l' && s3.charAt(2)=='l')
		    {
		        flag=1;
		    }
		    if(flag==1)
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
