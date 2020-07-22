/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<10)
		{
		    System.out.println("1");
		}
		else if(a>=10 && a<=99)
		{
		    System.out.println("2");
		}
		else if(a>=100 && a<=999)
		{
		    System.out.println("3");
		}
		else if(a>=1000 && a<=1000000)
		{
		    System.out.println("More than 3 digits");
		}
		else
		{
		    System.out.println("Error");
		}
	}
}
