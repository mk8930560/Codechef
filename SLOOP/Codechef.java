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
	        String s[]= ob.readLine().split(" ");
	        
	        int M = Integer.parseInt(s[0]);
	        int S = Integer.parseInt(s[1]);
	        
	        if(M>=S)
	        {
	            System.out.println(M/S);
	        }
	        else
	            System.out.println("0");
	    }
	}
}
