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
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int Box = sc.nextInt();
		    int CrntCoinLocation = sc.nextInt();
		    int swap =sc.nextInt();
		    for(int i=0;i<swap;i++)
		    {
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        if(CrntCoinLocation==a)
		            CrntCoinLocation=b;
		        else if(CrntCoinLocation==b)
		            CrntCoinLocation=a;
		    }
		    System.out.println(CrntCoinLocation);
		}
	}
}
