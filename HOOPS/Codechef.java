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
	        int N = Integer.parseInt(ob.readLine());
	        if(N==1)
	            System.out.println("1");
	        else
	        {
	            int value=N/2;
	            System.out.println(N-value);
	        }
	    }
	}
}
