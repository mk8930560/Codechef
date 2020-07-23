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
		    StringBuilder s1=new StringBuilder();
		    if(n==s.length())
		    {
		        if(s.length()%2==0)
		        {
		            for(int i=0;i<s.length();i=i+2)
		            {
		                s1.append(s.charAt(i+1));
		                s1.append(s.charAt(i));
		            }
		        }
		        else if(s.length()%2!=0)
		        {
		            for(int i=0;i<s.length()-1;i=i+2)
		            {
		                s1.append(s.charAt(i+1));
		                s1.append(s.charAt(i));
		            }
		            s1.append(s.charAt(s.length()-1));
		        }
		    }
		    StringBuilder s2=new StringBuilder();
		    for(int i=0;i<s1.length();i++)
		    {
		        char c=s1.charAt(i);
		        s2.append((char)(122 - (int)(c) + 97));
		    }
		    System.out.println(s2);
		}
	}
}
