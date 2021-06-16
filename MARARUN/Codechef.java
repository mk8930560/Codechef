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
	        
	        int D = Integer.parseInt(s[0]);
	        int d = Integer.parseInt(s[1]);
	        int A = Integer.parseInt(s[2]);
	        int B = Integer.parseInt(s[3]);
	        int C = Integer.parseInt(s[4]);
	        
	        if((D*d)<10)
	            System.out.println("0");
	        else if((D*d)>=10 && (D*d)<21)
	            System.out.println(A);
	        else if((D*d)>=21 && (D*d)<42)
	            System.out.println(B);
	        else if((D*d)>=42)
	            System.out.println(C);
	        
	    }
	}
}
