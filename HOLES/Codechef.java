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
		    String s=sc.next();
		    int count=0;
		    for(int i=0;i<s.length();i++)
		    {
		        char c=s.charAt(i);
		        if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
		        {
		            count+=1;
		        }
		        else if(c=='B')
		        {
		            count+=2;
		        }
		        else
		        {
		            count+=0;
		        }
		    }
		    System.out.println(count);
		}
	}
}
