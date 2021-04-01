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
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        int count=0;
	        int length=s.length();
	        for(int i=0;i<length;i++)
	        {
	            if(s.charAt(i)=='4')
	                count++;
	        }
	        System.out.println(count);
	    }
	}
}
