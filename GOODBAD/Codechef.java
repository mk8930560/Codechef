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
		    int miss=sc.nextInt();
		    String s=sc.next();
		    int chef=0;
		    int brother=0;
		    for(int i=0;i<s.length();i++)
		    {
		        char c=s.charAt(i);
		        if(c>='a' && c<='z')
		        {
		            chef++;
		        }
		        else if(c>='A' && c<='Z')
		        {
		            brother++;
		        }
		    }
		    if(chef<=miss && brother<=miss)
		    {
		        System.out.println("both");
		    }
		    else if(chef<=miss && brother>=miss)
		    {
		        System.out.println("brother");
		    }
		    else if(brother<=miss && chef>=miss)
		    {
		        System.out.println("chef");
		    }
		    else
		    {
		        System.out.println("none");
		    }
		}
	}
}
