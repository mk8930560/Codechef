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
		while(a-->0)
		{
		    //h for hardnees
		    //c for carbon
		    //s for strength
		    int h=sc.nextInt();
		    double c=sc.nextDouble();
		    int s=sc.nextInt();
		    if(h>50 && c<0.7 && s>5600)
		    {
		        System.out.println("10");
		    }
		    else if(h>50 && c<0.7)
		    {
		        System.out.println("9");
		    }
		    else if(c<0.7 && s>5600)
		    {
		        System.out.println("8");
		    }
		    else if(h>50 && s>5600)
		    {
		        System.out.println("7");
		    }
		    else if(h>50 || c<0.7 || s>5600)
		    {
		        System.out.println("6");
		    }
		    else
		    {
		        System.out.println("5");
		    }
		}
	}
}
