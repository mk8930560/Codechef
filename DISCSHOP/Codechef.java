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
		    String s=ob.readLine();
		    String arr[]=new String[s.length()];
		    for(int i=0;i<s.length();i++)
		        arr[i]=String.valueOf(s.charAt(i));
		    int min=1000000000;
		    for(int i=0;i<s.length();i++)
		    {
		        StringBuilder str=new StringBuilder();
		        for(int j=0;j<s.length();j++)
		        {
		            if(j!=i)
		                str.append(arr[j]);
		        }
		        if(min>Integer.parseInt(str.toString()))
		            min=Integer.parseInt(str.toString());
		    }
		    System.out.println(min);
		}
	}
}
