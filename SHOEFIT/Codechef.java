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
	        String s[] = ob.readLine().split(" ");
	        
	        int Right = 0;
	        int Left = 0;
	        
	        for(String value:s)
	        {
	            if(value.equals("1"))
	                Right=1;
	            else if(value.equals("0"))
	                Left=1;
	        }
	        if(Right==1 && Left==1)
	            System.out.println("1");
	        else
	            System.out.println("0");
	    }
	}
}
