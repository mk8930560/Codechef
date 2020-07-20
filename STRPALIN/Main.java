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
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(ob.readLine());
		while(t-->0)
		{
		    String s1=ob.readLine();
		    String s2=ob.readLine();
		    int flag=0;
		    for(int i=0;i<s1.length();i++)
		    {
		        for(int j=0;j<s2.length();j++)
		        {
		            if(s1.charAt(i)==s2.charAt(j))
		            {
		                flag=1;
		                break;
		            }
		        }
		    }
		    if(flag==1)
		    {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
