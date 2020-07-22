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
	        int area=0;
	        int maxarea=0;
	        int totalItem=sc.nextInt();
	        int Budget=sc.nextInt();
	        for(int i=1;i<=totalItem;i++)
	        {
	            int Width=sc.nextInt();
	            int Height=sc.nextInt();
	            int price=sc.nextInt();
	            if(price<=Budget)
	            {
	                area=Width*Height;
	                if(area>maxarea)
	                {
	                    maxarea=area;
	                }
	            }
	        }
	        if(maxarea==0)
	        {
	            System.out.println("no tablet");
	        }
	        else
	        {
	            System.out.println(maxarea);
	        }
	    }
	}
}
