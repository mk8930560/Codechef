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
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next();
		    StringBuilder str = new StringBuilder();
		    for(int i =0;i<s.length();)
		    {
		        int startIndex=i;
		        int lastIndex=i;
		        int count=0;
		        for(int j=lastIndex;j<s.length();j++)
		        {
		            if(s.charAt(i)==s.charAt(j))
		            {
		            	count++;
		                lastIndex++;
		            }
		            else if(s.charAt(i)!=(s.charAt(j)))
		                break;
		        }
		        str.append(s.charAt(i)+""+count);
		        i=lastIndex;
		    }
		    if(str.length()<s.length())
		    	System.out.println("YES");
		    else
		    	System.out.println("NO");
		}
	}
}
