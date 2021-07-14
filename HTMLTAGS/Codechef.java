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
	        String s = ob.readLine();
	        
	        int length = s.length();
	        
	        if(length>=4)
	        {
	            if(s.charAt(0)=='<'&& s.charAt(1)=='/'
	               && s.charAt(length-1)=='>')
	               {
	                   int flag=0;
	                   for(int i=2;i<=length-2;i++)
	                   {
	                       if((int)s.charAt(i)>=33 && (int)s.charAt(i)<=47
	                        || (int)s.charAt(i)>=58 && (int)s.charAt(i)<=96
	                        || (int)s.charAt(i)>=123 && (int)s.charAt(i)<=126
	                        || (int)s.charAt(i)>=123 && (int)s.charAt(i)<=126)
	                        {
	                            flag=1;
	                        }
	                   }
	                   if(flag==0)
	                        System.out.println("Success");
	                    else
	                        System.out.println("Error");
	               }
	               else
	                    System.out.println("Error");
	        }
	        else
	            System.out.println("Error");
	    }
	}
}
