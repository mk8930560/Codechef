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
	        String s[]=ob.readLine().split(" ");
	        double U=Double.parseDouble(s[0]);
	        double V=Double.parseDouble(s[1]);
	        double A=Double.parseDouble(s[2]);
	        double S=Double.parseDouble(s[3]);
	        
	        if(U==V)
	            System.out.println("YES");
	        else{
	            double answer=Math.sqrt((U*U)-(2*A*S));
	            if(answer>V)
	                System.out.println("NO");
	            else
	                System.out.println("YES");
	        }
	    }
	}
}
