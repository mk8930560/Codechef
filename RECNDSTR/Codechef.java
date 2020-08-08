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
		int t = Integer.parseInt(ob.readLine());
		while(t-->0)
		{
		    String s=ob.readLine();
		    StringBuilder L=new StringBuilder();
		    StringBuilder R=new StringBuilder();
		    if(s.length()==1)
		    {
		        System.out.println("YES");
		    }else
		    {
		        for(int i=1;i<s.length();i++)
		        {
		            L.append(s.charAt(i));
		        }
		        L.append(s.charAt(0));
		        R.append(s.charAt(s.length()-1));
		        for(int i=0;i<s.length()-1;i++)
		        {
		            R.append(s.charAt(i));
		        }
		        if(L.toString().equals(R.toString()))
		            System.out.println("YES");
		        else
		            System.out.println("NO");
		    }
		}
	}
}
