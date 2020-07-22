/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int gcd(int a,int b)
    {
        if(a==0)
        return b;
        else
        return gcd(b%a,a);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int length=sc.nextInt();
	        int breadth=sc.nextInt();
	        int gcd=gcd(length,breadth);
	        int total=(length/gcd)*(breadth/gcd);
	        System.out.println(total);
	    }
	}
}
