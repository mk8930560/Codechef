/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int x1=sc.nextInt();
	        int y1=sc.nextInt();
	        int x2=sc.nextInt();
	        int y2=sc.nextInt();
	        if(x1==x2)
	        {
	            if(y1<y2)
	            {
	                System.out.println("up");
	            }
	            else
	            {
	                System.out.println("down");
	            }
	        }
	        else if(y1==y2)
	        {
	            if(x1<x2)
	            {
	                System.out.println("right");
	            }
	            else
	            {
	                System.out.println("left");
	            }
	        }
	        else
	        {
	            System.out.println("sad");
	        }
	    }
	}
}
