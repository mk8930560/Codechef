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
	        
	        int d = Integer.parseInt(s[0]);
	        int x = Integer.parseInt(s[1]);
	        int y = Integer.parseInt(s[2]);
	        int z = Integer.parseInt(s[3]);
	        
	        int Time1=7*x;
	        int Time2=(d*y)+((7-d)*z);
	        
	        if(Time1>Time2)
	            System.out.println(Time1);
	        else
	            System.out.println(Time2);
	        
	        
	        
	    }
	}
}
