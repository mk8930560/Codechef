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
	        int length=Integer.parseInt(ob.readLine());
	        String s=ob.readLine();
	        int f=0;
	        for(int i=0;i<length-1;i++)
	        {
	            if(s.charAt(i)==s.charAt(length-1)){
	                f=1;
	                break;
	            }
	        }
	        if(f==1)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	        
	    }
	}
}
