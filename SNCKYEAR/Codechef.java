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
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		    int b=sc.nextInt();
		    if(b==2010||b==2015||b==2016||b==2017||b==2019)
		    {
		        System.out.println("HOSTED");
		    }
		    else
		    {
		        System.out.println("NOT HOSTED");
		    }
		}
	}
}
