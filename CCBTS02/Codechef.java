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
	        int query = Integer.parseInt(ob.readLine());
	        String s[]=ob.readLine().split(" ");
	        int flag=-1;
	        int output=200;
	        for(int i=0;i<query;i++)
	        {
	            if(s[i].equals("start") || s[i].equals("restart"))
	            {
	                flag=1;
	                output=200;
	            }
	            else if(s[i].equals("stop"))
	            {
	                if(flag==1)
	                {
	                    flag=0;
	                    output=200;
	                }
	                else if(flag==-1 || flag==0)
	                {
	                    flag=0;
	                    output=404;
	                }
	            }
	            if(output==404)
	                break;
	        }
	        System.out.println(output);
	    }
	}
}
