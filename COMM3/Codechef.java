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
		    double r=sc.nextInt();
		    int x1=sc.nextInt();
		    int y1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y2=sc.nextInt();
		    int x3=sc.nextInt();
		    int y3=sc.nextInt();
		    double d1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		    double d2=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		    double d3=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		    if(d1<=r && d2<=r|| d1<=r && d3<=r || d2<=r && d3<=r)
		    {
		        System.out.println("yes");
		    }
		    else
		    {
		        System.out.println("no");
		    }
		}
	}
}
