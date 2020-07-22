/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static BigInteger fact(int number)
    {
        BigInteger value=new BigInteger("1");
        for(int i=1;i<=number;i++)
        {
            value=value.multiply(BigInteger.valueOf(i));
        }
        return value;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int number=sc.nextInt();
		    System.out.println(fact(number));
		}
	}
}
