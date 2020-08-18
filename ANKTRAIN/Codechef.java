/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void Find(int a,int b,int c)
	{
		if(a>=b && a<=c)
		{
			if(a==b || a==b+3)
			{
				if(a==b)
					System.out.println(String.valueOf(b+3)+"LB");
				else if(a==b+3)
					System.out.println(String.valueOf(b)+"LB");
			}else if(a==b+1 || a==b+4)
			{
				if(a==b+1)
					System.out.println(String.valueOf(b+4)+"MB");
				else if(a==b+4)
					System.out.println(String.valueOf(b+1)+"MB");
			}else if(a==b+2 || a==b+5)
			{
				if(a==b+2)
					System.out.println(String.valueOf(b+5)+"UB");
				else if(a==b+5)
					System.out.println(String.valueOf(b+2)+"UB");
			}else if(a==c-1 || a==c)
			{
				if(a==c-1)
					System.out.println(String.valueOf(c)+"SU");
				else if(a==c)
					System.out.println(String.valueOf(c-1)+"SL");
			}		
		}else
			Find(a, c+1, c+8);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int a=sc.nextInt();
			int StartValue=1;
			int LastValue=8;
			Find(a,StartValue,LastValue);
	    }
	}
}
