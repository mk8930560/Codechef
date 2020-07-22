/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		double A=sc.nextInt();
		double B=sc.nextInt();
		double C=sc.nextInt();
		double sq=Math.sqrt(B*B-4*A*C);
		System.out.println((-B+sq)/(2*A));
		System.out.println((-B-sq)/(2*A));
	}
}
