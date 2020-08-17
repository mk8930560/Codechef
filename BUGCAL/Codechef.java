/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int Sum(int a,int b)
	{
		int res=0;
		int Muliplier=1;
		int sum=0;
		while(true)
		{
			if(a==0 && b==0)
				break;
			sum=(a%10)+(b%10);
			sum%=10;
			res=(sum*Muliplier)+res;
			a/=10;
			b/=10;
			Muliplier*=10;
		}
		return res;
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        System.out.println(Sum(a,b));
	    }
	}
}
