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
		    int countzero=0;
		    int countone=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)=='0')
		        {
		            countzero++;
		        }
		        else if(s.charAt(i)=='1')
		        {
		            countone++;
		        }
		    }
		    if(countone==1||countzero==1)
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
