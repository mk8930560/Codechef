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
	        int n=sc.nextInt();
	        int maxSpace=sc.nextInt();
	        int maxRating=0;
	        while(n-->0)
	        {
	            int size=sc.nextInt();
	            int Rating=sc.nextInt();
	            if(size<=maxSpace && Rating>maxRating)
	                maxRating=Rating;
	        }
	        System.out.println(maxRating);
	    }
	}
}
