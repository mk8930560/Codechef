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
		    int a=sc.nextInt();
		    String s1=sc.next();
		    if(s1.contains("I"))
		    {
		        System.out.println("INDIAN");
		    }
		    else if(!s1.contains("Y"))
		    {
		        System.out.println("NOT SURE");
		    }
		    else
		    {
		        System.out.println("NOT INDIAN");
		    }
		}
	}
}
