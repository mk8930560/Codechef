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
	        
	        int A = Integer.parseInt(s[0]);
	        int B = Integer.parseInt(s[1]);
	        int C = Integer.parseInt(s[2]);
	        int D = Integer.parseInt(s[3]);
	        
	        
	        if((A+C)>=180 && (B+D)>=180)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	    }
	}
}
