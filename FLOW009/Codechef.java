/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    double quantity=sc.nextDouble();
		    double price=sc.nextDouble();
		    double cost=0;
		    if(quantity>1000)
		    {
		        cost=quantity*price-(quantity*price*10/100);
		    }
		    else
		    {
		        cost=quantity*price;
		    }
		    System.out.printf("%.6f\n",cost);
		}
	}
}
