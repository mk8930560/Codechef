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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(Math.abs(a)+Math.abs(b)+Math.abs(c)==2*Math.max(Math.abs(a),Math.max(Math.abs(b),Math.abs(c))))
		        System.out.println("yes");
		    else
		        System.out.println("no");
		}
	}
}
