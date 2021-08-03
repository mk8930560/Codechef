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
	        
	        Long A = Long.parseLong(s[0]);
 	        Long B = Long.parseLong(s[1]);
	        Long C = Long.parseLong(s[2]);
	        
	        Long max=0L;
	        
	        if((A+B)>max)
	            max=A+B;
	        if((B+C)>max)
	            max=B+C;
	        if((A+C)>max)
	            max=A+C;
	
	        System.out.println(max);
	        
	    }
	}
}
