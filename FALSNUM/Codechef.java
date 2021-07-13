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
	        String A = ob.readLine();
	        
	        int length= A.length();
	        
	        if(A.charAt(0)=='1')
	        {
	            System.out.println(A.substring(0,1)+"0"+A.substring(1,length));
	        }
	        else
	        {
	            System.out.println("1"+A);
	        }
	    }
	}
}
