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
		String s1=sc.next();
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s2=sc.next();
		    int count=0;
		    for(int i=0;i<s1.length();i++)
		    {
		        for(int j=0;j<s2.length();j++)
		        {
		            if(s1.charAt(i)==s2.charAt(j))
		            {
		                count++;
		            }
		        }
		    }
		    if(count==s2.length())
		    {
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		}
	}
}
