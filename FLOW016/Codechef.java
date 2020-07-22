/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long gcd(long a,long b)
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
		    long a=sc.nextInt();
		    long b=sc.nextInt();
		    long gcd=gcd(a,b);
		    long lcm=(a*b)/gcd;
		    System.out.println(gcd+" "+lcm);
		}
	}
}
