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
	        double x = Double.parseDouble(s[0]);
	        double y = Double.parseDouble(s[1]);
	        double xr = Double.parseDouble(s[2]); 
	        double yr = Double.parseDouble(s[3]);
	        double D = Double.parseDouble(s[4]);
	        
	        double answer = Math.min(x/xr,y/yr);
	        if(answer>=D)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	    }
	}
}
