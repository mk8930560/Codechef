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
		    StringBuilder sb=new StringBuilder();
		    for(int i=0;i<s.length();i++)
		    {
		        char c=s.charAt(i);
		        if(c=='>')
		        {
		            sb.append("<");
		        }
		        else if(c=='<')
		        {
		            sb.append(">");
		        }
		        else if(c=='*')
		        {
		            sb.append("*");
		        }
		    }
		    String NewS=sb.toString();
		    int count=0;
		    for(int i=0;i<NewS.length()-1;i++)
		    {
		        char c1=NewS.charAt(i);
		        char c2=NewS.charAt(i+1);
		        if(c1=='>' && c2=='<')
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
