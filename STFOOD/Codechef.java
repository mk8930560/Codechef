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
	        int TotalStore=sc.nextInt();
	        int profit=0;
	        while(TotalStore-->0)
	        {
	            int storeType=sc.nextInt();
	            int People=sc.nextInt();
	            int Price=sc.nextInt();
	            if(profit<Price*(People/(storeType+1)))
	                profit=Price*(People/(storeType+1));
	        }
	        System.out.println(profit);
	    }
	}
}
