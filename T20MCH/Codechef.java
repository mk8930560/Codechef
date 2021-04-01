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
	    int R=sc.nextInt();
	    int O=sc.nextInt();
	    int C=sc.nextInt();
	    int value=(((20-O)*6)*6)+C;
	    if(value>R)
	        System.out.println("YES");
	    else
	        System.out.println("NO");
	}
}
