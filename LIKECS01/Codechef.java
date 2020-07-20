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
		    int flag=0;
		    for(int i=0;i<s.length();i++)
		    {
		        for(int j=i+1;j<s.length();j++)
		        {
		            if(s.charAt(i)==s.charAt(j))
		            {
		                flag=1;
		                break;
		            }
		        }
		    }
		    if(flag==1)
		    {
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		    
		}
	}
}
