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
	        int A=Integer.parseInt(s[0]);
	        int B=Integer.parseInt(s[1]);
	        
	        int total=A+B;
	        
	        if(total<3)
	            System.out.println("1");
	        else if(total>=3 && total<=10)
	            System.out.println("2");
	        else if(total>=11 && total<=60)
	            System.out.println("3");
	        else
	            System.out.println("4");
	    }
	    
	}
}
