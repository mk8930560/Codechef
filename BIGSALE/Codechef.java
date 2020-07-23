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
		    double loss=0;
		    int Offer=sc.nextInt();
		    while(Offer-->0)
		    {
		        double price=sc.nextInt();
		        double pieces=sc.nextInt();
		        double discount=sc.nextInt();
		        
		        double newPrice=price+(price*discount/100);
		        double afterDiscountprice=newPrice-(newPrice*discount/100);
		        
		        double lostperunit=price-afterDiscountprice;
		        
		        loss+=pieces*lostperunit;
		    }
		    System.out.printf("%.10f\n",loss);
		}
	}
}
